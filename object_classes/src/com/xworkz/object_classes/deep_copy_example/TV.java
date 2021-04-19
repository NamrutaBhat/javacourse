package com.xworkz.object_classes.deep_copy_example;

public class TV  implements Cloneable{
	String brand;
	String type;
	Sony sony;
	
	public TV(String brand,String type,Sony sony)
	{
		this.brand=brand;
		this.type=type;
		this.sony=sony;
	}

	@Override
	public String toString() {
		return "TV [brand=" + brand + ", type=" + type + ", sony=" + sony + "]";
	}

	protected Object clone() throws CloneNotSupportedException{
	
		TV tv=(TV)super.clone();
		tv.sony=(Sony)sony.clone();
		return tv;
	}
	
	
	

}
