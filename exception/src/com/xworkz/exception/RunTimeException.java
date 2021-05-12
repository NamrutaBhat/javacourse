package com.xworkz.exception;

public class RunTimeException {

	public static void main(String[] args) {
		try
		{
			String s=null;
			System.out.println(s.length());
		}

		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		
		try
		{
			int arr[]=new int[10];
			arr[10]=500;
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		
	}

}
