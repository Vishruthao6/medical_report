package com.vishrutha.RestApi.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.vishrutha.RestApi.model.UserModel;

public interface Repository extends JpaRepository<UserModel,Integer> {

	boolean existsByEmail(String email);
     
}