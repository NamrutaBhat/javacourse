package com.xworkz.array.multi_dimenional_array;

public class MultiDimensionalEX {

	public static void main(String[] args) {
		
    int[][] EvenNumbers=new int[4][4];
 
 
		for(int i=1;i<EvenNumbers.length;i++){
			
			for(int j=1;j<EvenNumbers[i].length;j++){
				EvenNumbers[i][j]=j*2;
				}
		
			
			
			
		
		}
		
		
for(int i=1;i<EvenNumbers.length;i++){
			
			for(int j=1;j<EvenNumbers[i].length;j++){
			
				System.out.print(EvenNumbers[i][j]+" ");
			}
			System.out.println();
		}
}		

}	


