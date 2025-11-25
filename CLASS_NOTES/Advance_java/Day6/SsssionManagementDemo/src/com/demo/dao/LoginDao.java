package com.demo.dao;

import com.demo.beans.MyUser;

public interface LoginDao {

	MyUser checkUser(String uname, String pass);

}
