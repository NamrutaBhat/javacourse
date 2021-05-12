package com.xworkz.exception;

public class CompileTimeExample {

	public static void main(String[] args) {
		
		try
		{
			int div=100/0;
		}

		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		
		
		try
		{
			String s="namruta";
	        int i=Integer.parseInt(s);
		}

		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		
	
		
		
	
		
	}

}
