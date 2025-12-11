package com.demo.SpringBootRestWebservice.utility;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.lang.Arrays;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;


@Component
public class JwtFilter extends OncePerRequestFilter {

    @Autowired
    private JwtUtil jwtUtil;
    
    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

        String authHeader = request.getHeader("Authorization");
        System.out.println("In validation filter Auth header ");
        System.out.println(authHeader);
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            String token = authHeader.substring(7).trim();
        	System.out.println("token--->"+token);
            try {
                Claims claims = jwtUtil.extractClaims(token);
                String username = claims.getSubject();
                String role = claims.get("role", String.class);
                System.out.println("In validation filter Auth header if ");
                UsernamePasswordAuthenticationToken authToken =
                        new UsernamePasswordAuthenticationToken(
                                username,
                                null,
                                List.of(new SimpleGrantedAuthority(role))
                        );

                SecurityContextHolder.getContext().setAuthentication(authToken);
            } catch (SecurityException e) {
                System.out.println("Invalid JWT signature: " + e.getMessage());
                //throw e; 
            } catch (MalformedJwtException e) {
                System.out.println("Invalid JWT token: " + e.getMessage());
                //throw e;
            } catch (ExpiredJwtException e) {
                System.out.println("JWT token is expired: " + e.getMessage());
                //throw e;
            
            } catch (UnsupportedJwtException e) {
                System.out.println("JWT token is unsupported: " + e.getMessage());
                throw e;
            } catch (IllegalArgumentException e) {
                System.out.println("JWT claims string is empty: " + e.getMessage());
                //throw e;
            }catch (Exception e) {
            	
                System.out.println("JWT invalid: " + e.getMessage());
                e.printStackTrace();
            }
        }

        filterChain.doFilter(request, response);
    }
    
    @PostConstruct
    public void debugFilterKey() {
        byte[] keyBytes = jwtUtil.getSecret().getBytes(StandardCharsets.UTF_8);

        System.out.println("\n=== FILTER KEY DEBUG ===");
        System.out.println("SECRET length      = " + jwtUtil.getSecret().length());
        System.out.println("SECRET bytes length= " + keyBytes.length);
        System.out.println("KEY = " + Base64.getEncoder().encodeToString(jwtUtil.getKey().getEncoded()));

        System.out.println("Key hash           = " + jwtUtil.getKey().hashCode());
        System.out.println("=========================\n");
    }

}
