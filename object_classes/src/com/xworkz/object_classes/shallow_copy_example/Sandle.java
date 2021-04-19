package com.xworkz.object_classes.shallow_copy_example;

public class Sandle implements Cloneable{
	
	String brand;
	String type;
	Puma puma;
	
	public Sandle(String brand,String type,Puma puma)
	{
		this.brand=brand;
		this.type=type;
         this.puma=puma;
		
	}
	
	

	



	@Override
	public String toString() {
		return "Sandle [brand=" + brand + ", type=" + type + ", puma=" + puma + "]";
	}







	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	
	
}
