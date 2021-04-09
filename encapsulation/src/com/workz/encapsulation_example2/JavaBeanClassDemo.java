package com.workz.encapsulation_example2;

public class JavaBeanClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Fan fan=new Fan();
fan.setBrand("crompton");
fan.setColor("white");
fan.setNoOfPlates(3);
fan.setSpeed(3000);

System.out.println("brand of the fan is "+fan.getBrand());
System.out.println("color of the fan is "+fan.getColor());
System.out.println("number of plates of the fan is "+fan.getNoOfPlates());
System.out.println("brand of the fan is "+fan.getSpeed());

	}

}
