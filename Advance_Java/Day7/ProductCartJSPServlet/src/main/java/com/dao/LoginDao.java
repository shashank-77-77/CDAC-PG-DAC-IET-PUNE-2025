package com.dao;

import com.bean.MyUser;

public interface LoginDao {

	MyUser checkUser(String uname, String pass);

}
