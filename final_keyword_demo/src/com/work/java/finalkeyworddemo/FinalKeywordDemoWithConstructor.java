package com.work.java.finalkeyworddemo;

public class FinalKeywordDemoWithConstructor {
	
final int x;
final static int y=20;

FinalKeywordDemoWithConstructor(int value)
{
	x=value;
}


FinalKeywordDemoWithConstructor()
{
	x=200;
}                                     


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalKeywordDemoWithConstructor fkdc=new  FinalKeywordDemoWithConstructor(100);
		System.out.println("x: "+fkdc.x);
		System.out.println("y: "+y);
		
		FinalKeywordDemoWithConstructor fkdc1=new  FinalKeywordDemoWithConstructor(200);
		System.out.println("x: "+fkdc1.x);
		System.out.println("y: "+y);
		
		FinalKeywordDemoWithConstructor fkdc2=new  FinalKeywordDemoWithConstructor();
		System.out.println("x: "+fkdc2.x);   
		System.out.println("y: "+y);
		
		
		FinalKeywordDemoWithConstructor fkdc3=new  FinalKeywordDemoWithConstructor();
		System.out.println("x: "+fkdc3.x);   
		System.out.println("y: "+y);    
		
		
		
		
		
		
		


	}

}
