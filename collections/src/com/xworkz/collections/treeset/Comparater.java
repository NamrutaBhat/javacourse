package com.xworkz.collections.treeset;

import java.util.Comparator;

public class Comparater implements Comparator<Integer> {

	public int compare(StringBuffer o1, StringBuffer o2) {
	/*	if(o1==o2)
			return 0;
		
		else if(o1<o2)
			return 1;
		else 
			return -1;  */
		
        return o2.toString().compareTo(o1.toString());
    	
     //   return  -o1.compareTo(o2); descending
        //           o2.compareTo(o1)  descending
		// -o2.compareTo(o1)   ascending
       //  return +1  insertion order
        //return -1   opposite to insertion order
     //return 0; //    root   
    
		
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}

