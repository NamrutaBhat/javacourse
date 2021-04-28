package com.xworkz.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hi");
		sb.append("hello");
		System.out.println(sb);
		System.out.println(sb.capacity());

		
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.capacity());
		
		sb.reverse();
		System.out.println(sb);
		
		sb.deleteCharAt(1);
		System.out.println(sb);
		
		sb.delete(0, 3);
		System.out.println(sb);
		
		String pillow="pillow";
		sb.replace(0, 1, pillow);
		System.out.println(sb);
		
		
		
		
		
		
		
		
		
	}

}
