package com.xworkz.wrapper_class.boxing;

public class BoxingExample {

	public static void main(String[] args) {
		int i=10;
		Integer j=i; //auto boxing
		
	System.out.println(j.byteValue());
	System.out.println(j.floatValue());
	System.out.println(j.intValue());
	System.out.println(j.longValue());
	System.out.println(j.byteValue());
	System.out.println(j.shortValue());
	System.out.println(j.MAX_VALUE);
	System.out.println(j.MIN_VALUE);
	System.out.println(j.SIZE);
	System.out.println(j.reverse(i));
	System.out.println(j.rotateLeft(j, 2));
	System.out.println(j.rotateRight(j, 1));
	System.out.println(j.valueOf(i));

	
	Integer k=new Integer(i);   //explicit boxing
	System.out.println(k.floatValue());
	}

}
