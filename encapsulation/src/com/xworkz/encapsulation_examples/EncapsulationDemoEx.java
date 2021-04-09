package com.xworkz.encapsulation_examples;

public class EncapsulationDemoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fridge fridge=new Fridge();

fridge.setBrand("Godrej");
fridge.setColor("Grey");
fridge.setNoOfDoors(10);
fridge.setRatings(50);

System.out.println("brand of the fridge is "+fridge.getBrand());
System.out.println("color of the fridge is "+fridge.getColor());
System.out.println("the number  of the door of the fridge is "+fridge.getNoOfDoors());
System.out.println("ratings  of the fridge is "+fridge.getRatings());



	}

}
