package com.app.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDAO{

	@Override
	public String getUser() {
		// TODO Auto-generated method stub
		return "Sandya";
	}

}
