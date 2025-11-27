package com.dao;

import com.beans.MyUser;

public interface LoginDao {

	MyUser checkUser(String uname, String pass);

}
