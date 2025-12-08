package com.demo.dao;

import com.demo.beans.MyUser;

public interface LoginDao {

	MyUser autheticateUser(String uname, String pass);

}
