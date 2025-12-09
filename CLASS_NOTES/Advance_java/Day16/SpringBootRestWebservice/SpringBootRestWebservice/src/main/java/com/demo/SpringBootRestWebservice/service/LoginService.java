package com.demo.SpringBootRestWebservice.service;

import com.demo.SpringBootRestWebservice.beans.MyUSer;

public interface LoginService {

	MyUSer validateUser(String uname, String passwd);

}
