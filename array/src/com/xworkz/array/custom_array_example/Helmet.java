package com.xworkz.array.custom_array_example;

public class Helmet extends Object {
	String brand;
	String color;
	
	public Helmet(String brand,String color)
	{
		this.brand=brand;
		this.color=color;
		
	}

	@Override
	public String toString() {
		return "Helmet [brand=" + brand + ", color=" + color + "]";
	}
	


}
