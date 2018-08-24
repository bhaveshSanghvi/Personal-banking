package com.model.Dao;

import java.util.List;

import com.model.pojo.User;

public interface UserDao extends BaseDao{
		public User createUser();
		public List<User> getAllUsers();
		public User authenticate(String username, String password);
}
