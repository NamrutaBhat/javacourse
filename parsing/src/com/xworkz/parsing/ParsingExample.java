package com.xworkz.parsing;

public class ParsingExample {

	public static void main(String[] args) {
		String s1="50";
		String s2="50";
		System.out.println(s1+s2); //it prints 5050 we want the addition result so we go for the parsing techniques
		
		int i=Integer.parseInt(s1);
		int j=Integer.parseInt(s2);
		System.out.println("the result is :"+(i+j));
		
		String booleanValue="true";System.out.println(Boolean.parseBoolean(booleanValue));

	}

}
