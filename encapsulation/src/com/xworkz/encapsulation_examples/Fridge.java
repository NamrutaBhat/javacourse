package com.xworkz.encapsulation_examples;

public class Fridge {
	
private int noOfDoors;
private String brand;
private int ratings;
private String color;


public int getNoOfDoors(){
	
	return noOfDoors;
}
public void setNoOfDoors(int noOfDoors) {
	 if(noOfDoors <1 || noOfDoors>3)
	 {
		 this.noOfDoors = 0;
		 System.out.println("invalid input");
	
	 }
	
	
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getRatings() {
	
	
	return ratings;
}
public void setRatings(int ratings) {

	
	if(ratings<1 ||ratings>5)
	{
		this.ratings = 0;
		System.out.println("ratings should be within the value 5");
		
	}
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}


 

}
