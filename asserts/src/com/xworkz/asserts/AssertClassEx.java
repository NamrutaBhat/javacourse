package com.xworkz.asserts;
import org.junit.Test;

public class AssertClassEx {

	public static void main(String[] args) {
	String string2="asserts";
   String string1="asserts";
   
   String string3="test";
   String string4="test";
   
   String string5=null;
   
   int var1=1;
   int var2=2;
   
   int[] arrray1={1,2,3};
   int[] arrray2={1,2,3};
   
   assertEquals(string1,string2);  //compares 2 strings ,returns boolean value
   
   assertSame(string3,string4); //refers the two objects whether they points to the same object
   assertNotSame(string1,string3); 
   assertNotNull(string1); 
   assertNull(string5);
   assertTrue(variable<variable2); //returns boolean value
   assertArrayEquals(array1,array2); //checks whether the arrays are equal or not,returns boolean value
   
   

	}

}
