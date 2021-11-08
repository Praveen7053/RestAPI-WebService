package com.fexmon.springrest.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fexmon.springrest.pojo.Users;

public interface UsersDao extends JpaRepository<Users, Integer>{

}
