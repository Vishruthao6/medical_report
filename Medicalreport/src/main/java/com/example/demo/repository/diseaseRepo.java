package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.diseaseModel;



public interface diseaseRepo extends JpaRepository<diseaseModel,Integer> {

}