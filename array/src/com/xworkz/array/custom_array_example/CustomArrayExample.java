package com.xworkz.array.custom_array_example;

public class CustomArrayExample {

	public static void main(String[] args) {
		Helmet helmet=new Helmet("royalenfield","black");
		Helmet helmet1=new Helmet("vega","black");
		
		Perfume perfume=new Perfume("bodyspray","fog");
		Perfume perfume1=new Perfume("deodrant","yardley");
		
		Shoes shoes=new Shoes("bata",6);
		Shoes shoes1=new Shoes("woodland",8);
		
		TV tv=new TV("LED","Panasonic");
		TV tv1=new TV("LED","LG");
		
		Object objects[]={helmet,perfume,shoes,tv};
		Object object=new Perfume();
		
		System.out.println("displaying the things");
		
		for(int i=0;i<objects.length;i++)
		{
			if(perfume instanceof Object){
		
			Perfume perfume11=(Perfume)object;
			System.out.println(objects[i]);
		}
		}
		System.out.println("printing the name of the perfume");
		for(int i=0;i<objects.length;i++)
		{
			System.out.println(objects[i]);
		}
	}
	
}
