package com.xworkz.strings.string_methods.string_builder;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("hello");
		System.out.println(sb.capacity());
		System.out.println(sb);

		System.out.println(sb.substring(2)); //including second index it will print further string
		
		System.out.println(sb.subSequence(0, 2)); //excludes last index that we specified
		
		System.out.println(sb.length());
		
		System.out.println(sb.delete(3, 5)); //from 3 to 5th index it will deletes
		System.out.println(sb.delete(3, 3));
		
	
	}

}
