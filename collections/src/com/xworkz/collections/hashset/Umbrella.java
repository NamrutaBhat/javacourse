package com.xworkz.collections.hashset;

public class Umbrella {
	String brand;
	String color;
	double price;
	
	String size;
	public Umbrella(String brand, String color, double price, String size) {
	
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.size = size;
	}
	@Override
	public String toString() {
		return "Umbrella [brand=" + brand + ", color=" + color + ", price=" + price + ", size=" + size + "]";
	}
	
	

}
