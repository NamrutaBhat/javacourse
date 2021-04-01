package com.work.java.blocks;

public class SIBAndIIBDemo {
	static int x;
	int y;
	
	static{
		System.out.println("static");
		x=100;
		
	}
	
	{
		System.out.println("instance");
		y=200;
		
	}
	SIBAndIIBDemo(){
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SIBAndIIBDemo sib=new SIBAndIIBDemo();
		System.out.println("y"+ " "+sib.y);
		System.out.println("x"+" "+SIBAndIIBDemo.x);
		
	}

}
