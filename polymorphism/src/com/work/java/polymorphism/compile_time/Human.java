package com.work.java.polymorphism.compile_time;

public class Human {

	void speak(Friend f)
	{
		System.out.println("todays story");
	}
	void speak(Stranger f)
	{
		System.out.println("only story");
		
	}
	
}
