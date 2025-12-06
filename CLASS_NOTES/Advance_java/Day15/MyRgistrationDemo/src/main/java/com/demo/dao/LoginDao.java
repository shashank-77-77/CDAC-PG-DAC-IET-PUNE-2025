package com.demo.dao;

import com.demo.beans.MyRegisterUser;
import com.demo.beans.MyUSer;

public interface LoginDao {

	MyUSer autheticateUser(String uname, String passwd);

	void registeruser(MyRegisterUser user);

}
