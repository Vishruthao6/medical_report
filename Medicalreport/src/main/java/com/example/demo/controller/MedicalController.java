package com.example.demo.controller;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MedicalModel;
import com.example.demo.service.MedicalService;
@RestController
public class MedicalController {
	
		@Autowired
	public MedicalService hserv;
		@PostMapping("/postMedical")
		public String postMedical(@RequestBody MedicalModel hr) {
			hserv.saveMedical(hr);
			return "data saved";
		}
		@GetMapping("/getMedical")
		public List<MedicalModel> getMedicalInfo(){
			return hserv.getMedical();
		}
		@GetMapping("/users/{userId}")
		public ResponseEntity<?> getUserbyId(@PathVariable int userId){
			Optional<MedicalModel>Medical=hserv.getUserId(userId);
			if(Medical!=null) {
				return ResponseEntity.ok(Medical);
			}
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not available with ID"+userId);
		}
		@PutMapping("/updateMedical")
		public MedicalModel updateMedicalInfo(@RequestBody MedicalModel ha) {
			return hserv.updateMedical(ha);
		}
		@PutMapping("/updateMedicalif/{id}")
		public ResponseEntity<String>putMedicallInfo(@PathVariable int id,@RequestBody MedicalModel ha){
			boolean updated=hserv.updateMedicalif(id,ha);
			if(updated) {
				return ResponseEntity.ok("Medical with id "+id+" is updated");
			}
			else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Medical not exist with id: "+id);
			}
		}
	
		@DeleteMapping("/deleteMedical/{id}")
		public String removeMedical(@PathVariable("id") int hid) {
			hserv.deleteMedical(hid);
			return "Medical with id "+hid+" is deleted";
		}
		@DeleteMapping("/byRegParm")
		public String removeByRequestPam(@RequestParam("id") int id) {
			hserv.deleteMedical(id);
			return "Medical with id "+id+" is deleted";
		}
		@DeleteMapping("/deleteMedicallif/{id}")
		public ResponseEntity<String>deleteMedicalInfo(@PathVariable int id){
			boolean deleted=hserv.deleteMedicalif(id);
			if(deleted) {
				return ResponseEntity.ok("Medical with ID "+ id+ " deleted successfully");
			}
			else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Medical with ID does not exists");
			}
		}
			//sorting ascending
			@GetMapping("/sortAsc/{name}")
			public List<MedicalModel> sortasc(@PathVariable("name")String name)
			{
				  return hserv.sortByAsc(name);
			}
			//sorting descending
			@GetMapping("/sortDesc/{name}")
			public List<MedicalModel> sortdesc(@PathVariable("name")String name)
			{
				  return hserv.sortByDsc(name);
			}

			//pagination
			@GetMapping("/pagination/{num}/{size}")
			public List<MedicalModel> pagination(@PathVariable("num") int num,@PathVariable("size") int size){
				return hserv.pagination(num, size);
			}
			//pagination and sorting
			@GetMapping("/pagination/{num}/{size}/{name}")
			public List<MedicalModel> paginationAndSorting(@PathVariable("num") int num,@PathVariable("size") int size,@PathVariable("name") String name){
				return hserv.paginationAndSorting(num, size, name);
			}

		}