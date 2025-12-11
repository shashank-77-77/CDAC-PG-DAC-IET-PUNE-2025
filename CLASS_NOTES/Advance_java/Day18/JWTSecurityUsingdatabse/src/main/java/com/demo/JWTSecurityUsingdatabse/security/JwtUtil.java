package com.demo.JWTSecurityUsingdatabse.security;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {

	private static final String SECRET="Soham1234";
	
	private final SecretKey KEY=Keys.hmacShaKeyFor(SECRET.getBytes(StandardCharsets.UTF_8));
	
	public SecretKey getKey()
	{
		return KEY;
	}
	
	public String getSecret()
	{
		return SECRET;
	}
	
	 private static final long EXPIRATION = 24 * 60 * 60 * 1000;
	
	private String generateToken(UserDetails user) 
	{
		return Jwts.builder()
				.subject(user.getUsername())
				.claim("role","Role_ADMIN")
				.issuedAt(new Date())
				.expiration(new Date(System.currentTimeMillis()+EXPIRATION))
				.signWith(KEY)
				.compact();
	}
	
}
