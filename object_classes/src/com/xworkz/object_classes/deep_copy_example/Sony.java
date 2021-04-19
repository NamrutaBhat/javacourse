package com.xworkz.object_classes.deep_copy_example;

public class Sony implements Cloneable{
	
	String tvType;
	public Sony(String tvType)
	{
		this.tvType=tvType;
		
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
