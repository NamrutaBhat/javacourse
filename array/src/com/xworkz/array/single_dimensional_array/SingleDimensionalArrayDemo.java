package com.xworkz.array.single_dimensional_array;

public class SingleDimensionalArrayDemo {

	public static void main(String[] args) {
	String names[]=new String[4];
	names[0]="namruta";
	names[1]="vinayak";
	names[2]="swati";
	names[3]="shanti";
	
	for(int i=0;i<names.length;i++)
	{
		System.out.println(names[i]);
	}
	//this is one type to initialise 
	
	System.out.println("-------------------");
	
	//and the next one is the literals that is 
	
	char[] ch={'a','s','h','a',' ','m','a','m'};
	

	for(int i=0;i<ch.length;i++)
	{
		System.out.print(ch[i]);
	}
	}

}
