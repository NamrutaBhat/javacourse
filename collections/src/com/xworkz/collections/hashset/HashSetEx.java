package com.xworkz.collections.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
	    Umbrella umbrella1=new Umbrella("Camel","black",350.00,"small");
	    Umbrella umbrella2=new Umbrella("wolf","pink",380.00,"folded");
	    Umbrella umbrella3=new Umbrella("WildCraft","orange",250.00,"small");
	    Umbrella umbrella4=new Umbrella("Levi","green",250.00,"long");
	    Umbrella umbrella5=new Umbrella("WildCraft","orange",300.00,"meduim");
	    
	    HashSet<Umbrella> set=new HashSet<Umbrella>();
	   set.add(umbrella1);
	   set.add(umbrella2);
	   set.add(umbrella3);
	   set.add(umbrella4);
	   set.add(umbrella5);
	   
	   Iterator<Umbrella> itr=set.iterator();
	   while(itr.hasNext()){
		   Umbrella umbrella=itr.next();
		   if(umbrella.size.equals("meduim") || umbrella.color.equals("orange")){
			   System.out.println(umbrella);
		   }
		   
	   }
	   
	   
	    
	    
	    
	    

	}

}
