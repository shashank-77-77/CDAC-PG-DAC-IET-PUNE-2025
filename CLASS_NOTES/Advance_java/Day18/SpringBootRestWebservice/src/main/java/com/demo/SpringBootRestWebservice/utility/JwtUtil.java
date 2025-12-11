package com.demo.SpringBootRestWebservice.utility;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.SignatureException;
import jakarta.annotation.PostConstruct;

@Component
public class JwtUtil {

	private static final String SECRET = "MyStrongJwtSecretKey12345678901234";

    private final SecretKey KEY = Keys.hmacShaKeyFor(SECRET.getBytes(StandardCharsets.UTF_8));

    public SecretKey getKey() {
        return KEY;
    }

    public String getSecret() {
        return SECRET;
    }

    private static final long EXPIRATION = 24 * 60 * 60 * 1000; // 24 hours

    public String generateToken(String username, String role) {

        return Jwts.builder()
                .subject(username)
                .claim("role", role)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + EXPIRATION))
                .signWith(KEY)
                .compact();
    }

    public Claims extractClaims(String token) {
    	System.out.println("in extractClaims");
        try {
        Claims claim= Jwts.parser()
                .verifyWith(KEY)
                .build()
                .parseSignedClaims(token)
                .getPayload();
        System.out.println("user "+claim.getSubject()+","+claim.getIssuedAt()+","+claim.get("role", String.class));
        return claim;
        }catch (SecurityException e) {
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
        }
        return null;
		
    }
    

	

    
}
