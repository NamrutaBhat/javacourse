package com.xworkz.object_classes.deep_copy_example;

public class DeepCopyExample {

	public static void main(String[] args) {
	    Sony sony=new Sony("LED");
	    TV tv1=new TV("LG","WALLMOUNTED",sony);
	    TV tv2=null;
	    
	    try
	    {
	    	tv2=(TV)tv1.clone();
	    	
	    }
	    
	   catch(CloneNotSupportedException n)
	    {
		   n.printStackTrace();
	    }
	    
System.out.println(tv1.sony.tvType);
	    
tv2.sony.tvType="BOXType";

System.out.println(tv1.sony.tvType);
System.out.println(tv2.sony.tvType);


	    
	    
	}

}
