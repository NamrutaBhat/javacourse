package com.xworkz.object_classes.clone;

public class ClockTest {

	public static void main(String[] args) {
		Clock clock1=new Clock("dogital","ajantha");
		Clock clock2=new Clock("analog","titan");
		Clock clock3=null;
		
		
		System.out.println(clock1);
		System.out.println(clock2);
		
		clock1=clock3;
		
		
		try{
			
			
			clock3=(Clock) clock2.clone();
			}
			catch(CloneNotSupportedException e)
			{
				e.printStackTrace();
			}
			System.out.println("----------------");
			
			
			System.out.println(clock3);
			System.out.println(clock2);
			
			
		
System.out.println("----------------");
			
			
			System.out.println(clock2);
			System.out.println(clock3);
			
	}

}
