package com.service;

import com.beans.MyUser;

public interface LoginService {

	MyUser validateUser(String uname, String pass);

}
