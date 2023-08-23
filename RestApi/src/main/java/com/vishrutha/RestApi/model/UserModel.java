package com.vishrutha.RestApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="_task")
public class UserModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String password;
	private String email;
     private String address;
     private String allergies;
     private String treatement;
     private String age;
     private String gender;
     private String in_date;
     private String out_date;
     private String amount;
    
	
 
public UserModel() {
		super();
	}
public UserModel(int id, String name, String password, String email, String adderss, String allergies, String treatement, String age, String gender, String in_date, String out_date, String amount) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.address = adderss;
		this.allergies=allergies;
		this.treatement=treatement;
		this.age=age;
		this.gender=gender;
		this.in_date=in_date;
		this.out_date=out_date;
		this.amount=amount;
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getAllergies() {
	return allergies;
}
public void setAllergies(String allergies) {
	this.allergies = allergies;
}
public String getTreatement() {
	return treatement;
}
public void setTreatement(String treatement) {
	this.treatement = treatement;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getIn_date() {
	return in_date;
}
public void setIn_date(String in_date) {
	this.in_date = in_date;
}
public String getOut_date() {
	return out_date;
}
public void setOut_date(String out_date) {
	this.out_date = out_date;
}
public String getAmount() {
	return amount;
}
public void setAmount(String amount) {
	this.amount = amount;
}


}