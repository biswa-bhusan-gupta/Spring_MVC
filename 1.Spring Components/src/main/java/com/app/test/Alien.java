package com.app.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")// Shows "Object Created" Whenever Bean is Called
public class Alien {
	
   private int aid;
   private String name;
   private String tech;
   @Autowired
   @Qualifier("lap")
   private Laptop laptop;

   public Alien() {
	super();
	System.out.println("Object Created");
	// TODO Auto-generated constructor stub
   }

public Alien(int aid, String name, String tech) {
	super();
	this.aid = aid;
	this.name = name;
	this.tech = tech;
}

public int getAid() {
	return aid;
}

public void setAid(int aid) {
	this.aid = aid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getTech() {
	return tech;
}

public void setTech(String tech) {
	this.tech = tech;
}


public Laptop getLaptop() {
	return laptop;
}

public void setLaptop(Laptop laptop) {
	this.laptop = laptop;
}

public void show() {
	System.out.println("In Alien");
	 laptop.get();

}

@Override
public String toString() {
	return "Alien [aid=" + aid + ", name=" + name + ", tech=" + tech + "]";
}
   

   
}
