package com.service;

import com.beans.MyUser;
import com.dao.LoginDao;
import com.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {
	private LoginDao ldao;
	  
	  public LoginServiceImpl() {
		  ldao=new LoginDaoImpl();
	  }

	@Override
	public MyUser validateUSer(String uname, String pass) {
		return ldao.checkUser(uname,pass);
	}

}
