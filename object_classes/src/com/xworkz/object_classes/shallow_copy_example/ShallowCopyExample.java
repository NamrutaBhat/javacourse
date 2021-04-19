package com.xworkz.object_classes.shallow_copy_example;

public class ShallowCopyExample {

	public static void main(String[] args) {
		Puma puma=new Puma("black");
		Sandle sandle1=new Sandle("bata","flat",puma);
		
		Sandle sandle2=new Sandle("woodland","shoes",puma);
		Sandle sandle3=null;
		
		
		
		try
		{
			sandle3=(Sandle)sandle1.clone();
			
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}

		System.out.println(sandle3);
		System.out.println(sandle2);
		
		System.out.println(sandle1);
		
		
		System.out.println("-------------------------------");
		sandle3.puma.color="white";
		
		System.out.println(sandle3);
		System.out.println(sandle1);
		
		
		
	}

}
