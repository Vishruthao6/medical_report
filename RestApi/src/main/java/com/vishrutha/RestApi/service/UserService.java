package com.vishrutha.RestApi.service;

import java.util.List;

import com.vishrutha.RestApi.model.UserModel;

public interface UserService {
    public boolean addUser(UserModel user);
    
    public boolean updateUse(UserModel user);
	List<UserModel> getUser();
     public boolean deleteUser(int id);
	public boolean updateUser(int id, UserModel user);
    
}