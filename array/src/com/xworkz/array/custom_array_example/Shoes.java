package com.xworkz.array.custom_array_example;

public class Shoes extends Object{
	String brand;
	int lenght;
	
	
public Shoes(String brand,int lenght)
{
	this.brand=brand;
	this.lenght=lenght;
	
}
	
	@Override
	public String toString() {
		return "Shoes [brand=" + brand + ", lenght=" + lenght + "]";
	}
	
	

}
