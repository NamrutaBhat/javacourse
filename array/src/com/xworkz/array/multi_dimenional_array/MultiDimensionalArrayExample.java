package com.xworkz.array.multi_dimenional_array;

public class MultiDimensionalArrayExample {

	public static void main(String[] args) {
		String[][] nam=new String[4][4];
		
		char[][] name={ {'a','n'}, {'u','s'} ,{'h','a'},{'t','e'},{'j','a'},{'s','g'}};
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				
			
			System.out.print(name[i][j]+" ");
			
		    }
			System.out.println();
		
		 }
	}
}

