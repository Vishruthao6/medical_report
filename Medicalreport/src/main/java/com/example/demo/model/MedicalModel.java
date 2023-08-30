package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
	@Table(name="medicalname")
	public class MedicalModel {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int medicalId;
		@Column(name="medicalname")
		private String name;
		private String address;
		private String gender;
		private String disease;
		private String bloodgroup;
		private String phonenumber;
		private String doctorname;
		
		@OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="diseaseid")
		private diseaseModel diseaseid;
		
		@OneToMany(cascade=CascadeType.ALL)
		@JoinColumn(name="billerid",referencedColumnName = "medicalId")
		private List<billModel> billerid;


		
		public List<billModel> getBillerid() {
			return billerid;
		}
		public void setBillerid(List<billModel> billerid) {
			this.billerid = billerid;
		}
		public int getMedicalId() {
			return medicalId;
		}
		public void setMedicalId(int medicalId) {
			this.medicalId = medicalId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getDisease() {
			return disease;
		}
		public void setDisease(String disease) {
			this.disease = disease;
		}
		public String getBloodgroup() {
			return bloodgroup;
		}
		public void setBloodgroup(String bloodgroup) {
			this.bloodgroup = bloodgroup;
		}
		public String getPhonenumber() {
			return phonenumber;
		}
		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}
		public String getDoctorname() {
			return doctorname;
		}
		public void setDoctorname(String doctorname) {
			this.doctorname = doctorname;
		}
		public diseaseModel getDiseaseid() {
			return diseaseid;
		}
		public void setDiseaseid(diseaseModel diseaseid) {
			this.diseaseid = diseaseid;
		}
		
		
}