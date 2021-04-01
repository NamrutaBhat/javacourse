package com.work.java.blocks;

public class SIBAndIIB {

	static int x;
	int y;
	
	static{
		System.out.println("static 1");
		x=100;
		
	}
	
	static {
		System.out.println("static 2");
		
	}
	
	
	{
		System.out.println("instance 1");
		y=200;
		
	}
	
	
	{
		System.out.println("instance 2");
		
		
	}
	
	
	
	SIBAndIIB(){
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SIBAndIIB  sib=new SIBAndIIB();
		System.out.println("y"+ " "+sib.y);
		System.out.println("x"+" "+SIBAndIIBDemo.x);
		
	}

}