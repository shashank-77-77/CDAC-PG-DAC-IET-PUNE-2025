package com.demo.service;

import com.demo.beans.MyUSer;

public interface LoginService {

	MyUSer validateUser(String uname, String passwd);

}
