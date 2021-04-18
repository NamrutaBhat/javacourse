package com.xworkz.object_classes.clone;

public class Clock implements Cloneable{
	String type;
	String brand;
	
	public Clock(String type,String brand)
	{
		this.type=type;
		this.brand=brand;
	}

	@Override
	public String toString() {
		return "Clock [type=" + type + ", brand=" + brand + "]";
	}
protected Object clone() throws CloneNotSupportedException {
	return super.clone();
}
	
}
