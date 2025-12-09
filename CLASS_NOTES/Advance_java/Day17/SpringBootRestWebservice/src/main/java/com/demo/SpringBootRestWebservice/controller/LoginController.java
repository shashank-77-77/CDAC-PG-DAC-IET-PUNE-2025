package com.demo.SpringBootRestWebservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringBootRestWebservice.dto.MyUserDto;
import com.demo.SpringBootRestWebservice.utility.JwtUtil;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
    private JwtUtil jwtUtil;
	
	@PostMapping("/loginuser")
	public ResponseEntity<String> autheticateUser(@RequestBody MyUserDto myuserDto){
		System.out.println(myuserDto);
		if(myuserDto.getUsername().equals("admin1") && myuserDto.getPassword().equals("admin1")) {
			String token = jwtUtil.generateToken("admin", "ROLE_ADMIN");
            return ResponseEntity.ok(token);
		}
		if(myuserDto.getUsername().equals("user1") && myuserDto.getPassword().equals("user1")) {
            String token = jwtUtil.generateToken("user1", "ROLE_USER");
            return ResponseEntity.ok(token);
        }

        return ResponseEntity.status(401).body("Invalid credentials");
		
		
	}

}
