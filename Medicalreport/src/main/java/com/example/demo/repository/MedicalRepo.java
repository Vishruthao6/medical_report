package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.MedicalModel;

public interface MedicalRepo extends JpaRepository<MedicalModel,Integer>{

}