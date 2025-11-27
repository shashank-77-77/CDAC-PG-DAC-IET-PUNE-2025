package com.service;

import com.beans.MyUser;

public interface LoginService {

	MyUser validateUSer(String uname, String pass);

}
