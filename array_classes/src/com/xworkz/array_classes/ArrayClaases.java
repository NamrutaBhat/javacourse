package com.xworkz.array_classes;
import java.util.Arrays;

public class ArrayClaases {

	public static void main(String[] args) {
		int numbers[]={10,80,30,70,50,60};
		
		System.out.println("array list"+Arrays.asList(numbers)); //converts arrays into list
		
		System.out.println("-------------------------------");

		Arrays.sort(numbers);
		int key=20;
		System.out.println(key +"found at index= " +Arrays.binarySearch(numbers, key));
		System.out.println(key +"found at index= " +Arrays.binarySearch(numbers,1,2, key));
		System.out.println("-------------------------------");
		
		int no[]={15,50,90,60};
	//	System.out.println("array comparison"+Arrays.compare(numbers,no));
		
		System.out.println(Arrays.toString(numbers));
		System.out.println("copy of range example"+Arrays.toString(Arrays.copyOfRange(numbers, 1, 3)));
		System.out.println("-------------------------------");
		
	//	System.out.println("deepEquals method"+Arrays.deepEquals(numbers,no));
	//	System.out.println("deephash code "+Arrays.deepHashCode(numbers));
	//	System.out.println("deep to String "+Arrays.deeptoString(numbers));
		Arrays.fill(no, key);
		System.out.println("fill method"+Arrays.toString(no));
		
		System.out.println("-------------------------------");

		System.out.println(Arrays.hashCode(numbers));
		
		System.out.println("-------------------------------");
		//System.out.println("the element mismatch at index"+Arrays.mismatch(numbers,no));
		Arrays.sort(numbers,2,5);
		System.out.println("sorting elements from one index to another "+Arrays.toString(numbers));
		
		
		
		
		
		
	}

}
