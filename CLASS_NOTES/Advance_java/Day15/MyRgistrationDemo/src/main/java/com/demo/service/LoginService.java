package com.demo.service;

import com.demo.beans.MyRegisterUser;
import com.demo.beans.MyUSer;

public interface LoginService {

	MyUSer validateUser(String uname, String passwd);

	void registerUser(MyRegisterUser user);

}
