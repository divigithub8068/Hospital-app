package com.ty.hospital.dao;

import java.util.List;

import com.ty.hospital.dto.User;

public interface UserDao {
	public User saveUser(User user);
	public List<User> validateUser(String email,String password);
	public List<User> getAllUser();
	public User getUserById(int id);
	public User updateUser(User user,int id);
	public User deleteUserById(int id);
}
