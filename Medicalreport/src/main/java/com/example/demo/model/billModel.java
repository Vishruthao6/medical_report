package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


	@Entity
	
	public class billModel {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int billid;
		public int getBillid() {
			return billid;
		}
		public void setBillid(int billid) {
			this.billid = billid;
		}
		
		public String getMedicine() {
			return medicine;
		}
		public void setMedicine(String medicine) {
			this.medicine = medicine;
		}
		public String getMorningdose() {
			return morningdose;
		}
		public void setMorningdose(String morningdose) {
			this.morningdose = morningdose;
		}
		public String getAfternoondose() {
			return afternoondose;
		}
		public void setAfternoondose(String afternoondose) {
			this.afternoondose = afternoondose;
		}
		public String getNightdose() {
			return nightdose;
		}
		public void setNightdose(String nightdose) {
			this.nightdose = nightdose;
		}
		public String getAmount() {
			return amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		@Column(name="medicine")
		private String medicine;
		private String morningdose;
		private String afternoondose;
		private String nightdose;
		private String amount;
		
		
		
}