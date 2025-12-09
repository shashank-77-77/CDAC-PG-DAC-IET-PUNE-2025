package com.demo.SpringBootRestWebservice.service;

import com.demo.SpringBootRestWebservice.beans.MyUser;

public interface LoginService {

	MyUser validateUser(String uname, String passwd);

}
