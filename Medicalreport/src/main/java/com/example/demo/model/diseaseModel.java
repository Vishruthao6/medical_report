package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



	@Entity
	
	public class diseaseModel {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int disId;
		@Column(name="medicalname")
		private String haemolevel;
		private String bloodsugar;
		private String bloodpressure;
		private String weight;
		private String height;
		private String oxygenlevel;
		
		public int getDisId() {
			return disId;
		}
		public void setDisId(int disId) {
			this.disId = disId;
		}
		public String getHaemolevel() {
			return haemolevel;
		}
		public void setHaemolevel(String haemolevel) {
			this.haemolevel = haemolevel;
		}
		public String getBloodsugar() {
			return bloodsugar;
		}
		public void setBloodsugar(String bloodsugar) {
			this.bloodsugar = bloodsugar;
		}
		public String getBloodpressure() {
			return bloodpressure;
		}
		public void setBloodpressure(String bloodpressure) {
			this.bloodpressure = bloodpressure;
		}
		public String getWeight() {
			return weight;
		}
		public void setWeight(String weight) {
			this.weight = weight;
		}
		public String getHeight() {
			return height;
		}
		public void setHeight(String height) {
			this.height = height;
		}
		public String getOxygenlevel() {
			return oxygenlevel;
		}
		public void setOxygenlevel(String oxygenlevel) {
			this.oxygenlevel = oxygenlevel;
		}
		

}