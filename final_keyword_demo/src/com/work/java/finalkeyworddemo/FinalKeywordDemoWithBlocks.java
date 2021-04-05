package com.work.java.finalkeyworddemo;

public class FinalKeywordDemoWithBlocks {
	final int p;
	final static int q;
	static
	{
		q=1000;
	}
	static
	{
		
	}
	{
		p=5000;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeywordDemoWithBlocks fkb=new FinalKeywordDemoWithBlocks();
		System.out.println("p: "+fkb.p);
		System.out.println("q: "+q); 
		

	}

}
