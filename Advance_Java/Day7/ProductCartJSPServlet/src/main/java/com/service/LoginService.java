package com.service;

import com.bean.MyUser;

public interface LoginService {

	MyUser validateUSer(String uname, String pass);

}
