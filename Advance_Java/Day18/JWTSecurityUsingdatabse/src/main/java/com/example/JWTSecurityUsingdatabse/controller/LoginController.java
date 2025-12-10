package com.example.JWTSecurityUsingdatabse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JWTSecurityUsingdatabse.dto.MyUserDto;
import com.example.JWTSecurityUsingdatabse.security.JwtUtil;
import com.example.JWTSecurityUsingdatabse.security.MyUserDetailsService;


@CrossOrigin("*") //CORS error
@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired 
	private AuthenticationManager authManager;
    @Autowired 
    private JwtUtil jwtUtil;
    @Autowired 
    private MyUserDetailsService userDetailsService;

    @PostMapping("/loginuser")
    public ResponseEntity<String> authenticateuser(@RequestBody MyUserDto req) {
        System.out.println("in logincontroller ");
    	System.out.println(req);
        Authentication auth = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(req.getUsername(), req.getPassword())
        );

        UserDetails userDetails = userDetailsService.loadUserByUsername(req.getUsername());
        String token = jwtUtil.generateToken(userDetails);

        return ResponseEntity.ok(token);
    }
}