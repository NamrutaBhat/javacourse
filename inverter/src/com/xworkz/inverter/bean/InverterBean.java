package com.xworkz.inverter.bean;

public class InverterBean {
private int inverterId;
private String name;
private double price;
private String capacity;
private String brand;

public InverterBean ()
{
	System.out.println(this.getClass().getSimpleName()+" created");
}

public int getInverterId() {
	return inverterId;
}

public void setInverterId(int inverterId) {
	this.inverterId = inverterId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getCapacity() {
	return capacity;
}

public void setCapacity(String capacity) {
	this.capacity = capacity;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

@Override
public String toString() {
	return "InverterBean [inverterId=" + inverterId + ", name=" + name + ", price=" + price + ", capacity=" + capacity
			+ ", brand=" + brand + "]";
}



}
