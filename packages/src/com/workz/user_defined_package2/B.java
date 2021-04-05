package com.workz.user_defined_package2;
import  com.workz.user_defined_package1.*; //2nd type
//import import  com.workz.user_defined_package1.A;  1st type by using class name importing a package

public class B {
	
	void display2()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a=new A();
		System.out.println(a.a);
		System.out.println(a.b);
		a.dispaly();
		
		com.workz.user_defined_package1.A a1=new com.workz.user_defined_package1.A();
		//this is the third type of importing by fully qualified class name
		//usually we will not prfer this method
		System.out.println(a1.a);
		System.out.println(a1.b);
		a1.dispaly();

		

	}

}
