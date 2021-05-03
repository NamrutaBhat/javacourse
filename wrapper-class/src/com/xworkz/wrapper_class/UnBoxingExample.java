package com.xworkz.wrapper_class;

public class UnBoxingExample {

	public static void main(String[] args) {
		Integer i=10;
		int j=i;  //auto unboxing
		  int k=i.intValue(); //explicit unboxing
		  
		  System.out.println(j);
			System.out.println(k);

	}

}
