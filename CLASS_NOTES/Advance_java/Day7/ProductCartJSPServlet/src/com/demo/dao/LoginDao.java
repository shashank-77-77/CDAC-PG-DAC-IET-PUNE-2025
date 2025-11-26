package com.demo.dao;

import com.demo.bean.MyUser;

public interface LoginDao {

	MyUser checkUser(String uname, String pass);

}
