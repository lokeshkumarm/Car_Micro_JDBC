package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {
	
	@Id
	@GeneratedValue
	private String id;
	private String make;
	private String model;
	private int year;
	
	Car(){
		
	}
public Car(String id, String make, String model, int year) {
		super();
		this.setId(id);
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
@Override
public String toString(){
	return make + "" + model +"" + year;
}

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}

}
