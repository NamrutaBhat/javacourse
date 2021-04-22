package com.xworkz.array;

public class JaggedArrayExample {

	public static void main(String[] args) {
	   int[][] numbers=new int[4][];
	   
	   numbers[0]=new int[]{1,2,3,4,5};
	   
	   numbers[1]=new int[]{6,7,8,9};
	   
	   numbers[2]=new int[]{10,11,12};
	   
	   numbers[3]=new int[]{13,14};
	   
	   for(int i=0;i<numbers.length;i++){
		  for(int j=0;j<numbers[i].length;j++){
			  System.out.print(numbers[i][j]+" ");
			  
			  
		  }
		  System.out.println();
	   }

	}

}
