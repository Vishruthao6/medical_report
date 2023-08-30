package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.billModel;



public interface billRepo extends JpaRepository<billModel,Integer> {

}