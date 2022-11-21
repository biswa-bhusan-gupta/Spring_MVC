package com.app.test;

public class Address {
	
   private String district;
   private String state;
   private int pincode;


   
   public String getDistrict() {
	return district;
   }
   public void setDistrict(String district) {
	this.district = district;
   }
   public String getState() {
	return state;
   }
   public void setState(String state) {
	this.state = state;
   }
   
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}

@Override
public String toString() {
	return "Address [district=" + district + ", state=" + state + ", pincode=" + pincode + "]";
}
}

