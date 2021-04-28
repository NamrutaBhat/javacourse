package com.xworkz.strings.string_methods;

import java.util.Arrays;

public class StringMethodsDemo {

	public static void main(String[] args) {
	 String flower=new String("flower");
	 
	 String upperCase=flower.toUpperCase();
	 System.out.println( upperCase);
	 
	 char charAt4=flower.charAt(4);
	 System.out.println(charAt4);
	 
	 boolean result=flower.contains("wal");
	 System.out.println(result);
	 
	 boolean result1=flower.contains("wer");
	 System.out.println(result);
	 
	 boolean ends=flower.endsWith("er");
	 System.out.println(ends);
	 
	 boolean ends1=flower.endsWith("ar");
	 System.out.println(ends1);
	 
	 System.out.println("empty method demo"+"".isEmpty());
	 System.out.println("empty method demo"+flower.isEmpty());
	 
	 String replace=flower.replace("wer", "war");
	 System.out.println("replaced "+replace);
	 System.out.println("original "+flower);
	 
	 String wish="good morning";
String[] wishArray= wish.split(" ");
	 System.out.println(Arrays.toString(wishArray));
	 System.out.println(wishArray[0]);
	 
	 char[] charArray=flower.toCharArray();
	 System.out.println(Arrays.toString(charArray));
	 
	 String trim= flower.trim();
	 System.out.println(trim);
	 
	 upperCase.toLowerCase();
	 System.out.println(upperCase);
	 
	 flower.format(wish, wishArray);
	 
	int last= flower.lastIndexOf("flower");
	System.out.println(last);
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

	}

}
