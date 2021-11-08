package com.fexmon.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fexmon.springrest.dao.UsersDao;
import com.fexmon.springrest.pojo.Users;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UsersDao usersDao;

	public UserServiceImpl() {
	
	}
	
	//for return List
	@Override
	public List<Users> getUsers() {		
		return usersDao.findAll();
	}

	//for one id
	@Override
	public Users getUsers(int id) {

		
		return usersDao.getOne(id);
	}

	//for Add Users
	@Override
	public Users addUsers(Users users) {

		
		usersDao.save(users);
		
		return users;
	}

	
}
