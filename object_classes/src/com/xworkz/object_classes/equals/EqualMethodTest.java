package com.xworkz.object_classes.equals;

public class EqualMethodTest {

	public static void main(String[] args) {
		Bulb bulb1=new Bulb("LED","PHILIPS",20.00);
		Bulb bulb2=new Bulb("CFL","BAJAJ",20.00);
		Bulb bulb3=new Bulb("LED","PHILIPS",20.00);
		System.out.println(bulb1.equals(bulb2));
		System.out.println(bulb1.equals(bulb3));
		
		System.out.println(bulb3.getClass()); //fully qualified class name
	}

}
