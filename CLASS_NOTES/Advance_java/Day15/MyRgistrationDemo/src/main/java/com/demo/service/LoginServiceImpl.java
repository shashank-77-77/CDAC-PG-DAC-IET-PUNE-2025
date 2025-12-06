package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.MyRegisterUser;
import com.demo.beans.MyUSer;
import com.demo.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService{
	  @Autowired
      LoginDao ldao;
	
	public MyUSer validateUser(String uname, String passwd) {
		return ldao.autheticateUser(uname,passwd);
	}

	@Override
	public void registerUser(MyRegisterUser user) {
		ldao.registeruser(user);
		
	}

}
