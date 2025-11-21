package com.demo.service;

import com.demo.bean.MyUser;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService{
  private LoginDao ldao;
  
  public LoginServiceImpl() {
	  ldao=new LoginDaoImpl();
  }

@Override
public MyUser validateUSer(String uname, String pass) {
	return ldao.checkUser(uname,pass);
}
}
