package com.app.test;

import java.util.List;

public class User {
	
   private String name;
   private String email;
   private String password;
   private List<String> language;
   private Address address;
   

public User() {
	super();
	// TODO Auto-generated constructor stub
}



public User(String name,String email, String password, List<String> language, Address address) {
	super();
	this.name = name;
	this.email = email;
	this.password = password;
	this.language = language;
	this.address = address;
}




public List<String> getLanguage() {
	return language;
}

public void setLanguage(List<String> language) {
	this.language = language;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

@Override
public String toString() {
	return "User [name=" + name + ", email=" + email + ", password=" + password + ", language=" + language
			+ ", address=" + address + "]";
}


}
