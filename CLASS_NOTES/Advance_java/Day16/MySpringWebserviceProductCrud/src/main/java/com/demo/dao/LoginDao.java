package com.demo.dao;

import com.demo.beans.MyUSer;

public interface LoginDao {

	MyUSer autheticateUser(String uname, String passwd);

}
