package com.xworkz.collections.treeset;

import java.util.TreeSet;

public class CustomizedTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<>(new Comparater());
		t.add(2);
		t.add(2);
		t.add(4);
		t.add(3);
		t.add(5);
		t.add(6);
		System.out.println(t);
		

	}

}
