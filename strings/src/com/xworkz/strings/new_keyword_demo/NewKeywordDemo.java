package com.xworkz.strings.new_keyword_demo;

public class NewKeywordDemo {

	public static void main(String[] args) {
		String name=new String("namruta");
		String name1=new String("namruta");
		System.out.println(name==name1);
		System.out.println(name.intern().hashCode());
		System.out.println(name1.hashCode());

	}

}
