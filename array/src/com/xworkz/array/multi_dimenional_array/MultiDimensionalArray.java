package com.xworkz.array.multi_dimenional_array;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int[][] CovidCases=new int[4][4];
		
		for(int i=0;i<CovidCases.length;i++){
			for(int j=0;j<CovidCases[i].length;j++){
				CovidCases[i][j]=j;
			}
		}
		
		for(int i=0;i<CovidCases.length;i++){
			for(int j=0;j<CovidCases[i].length;j++){
				System.out.print(CovidCases[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
