package com.xworkz.collections.treeset;

import java.util.TreeSet;

public class TreeSetWithStringBuffer {

	public static void main(String[] args) {
		TreeSet<StringBuffer> ts=new TreeSet<>(new Comparater());
		ts.add(new StringBuffer(new StringBuffer("eco")));
		ts.add(new StringBuffer(new StringBuffer("om")));
		ts.add(new StringBuffer(new StringBuffer("marvante")));
		ts.add(new StringBuffer(new StringBuffer("kandla")));
		ts.add(new StringBuffer(new StringBuffer("apsarakonda")));
		System.out.println(ts);

	}

}
