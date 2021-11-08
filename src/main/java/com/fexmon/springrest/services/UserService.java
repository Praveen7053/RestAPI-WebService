package com.fexmon.springrest.services;

import java.util.List;

import com.fexmon.springrest.pojo.Users;

public interface UserService {

		public List<Users> getUsers();
		public Users getUsers(int id);
		public Users addUsers(Users users);
}
