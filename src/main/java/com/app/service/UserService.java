package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UserDAO;

@Service
public class UserService {

	@Autowired
	UserDAO userDao;

	public String getUser() {
		return userDao.getUser();
	}
	
	String getDob() {
		return "10022002";
	}

}
