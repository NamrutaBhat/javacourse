package com.xworkz.collections;
import java.util.ArrayList;

public class CustomArrayList {

	public static void main(String[] args) {
		Coconut coconut=new Coconut("green", 10, 30.00, 1);
		Coconut coconut1=new Coconut("orange", 20, 20.00, 0.5);
		Coconut coconut2=new Coconut("yelow", 30, 10.00, 2);
		Coconut coconut3=new Coconut("brown", 40, 5.00, 2);
		
		ArrayList<Coconut> list=new ArrayList<Coconut>();
		list.add(coconut);
		list.add(coconut1);
		list.add(coconut2);
		list.add(coconut3);
		
		System.out.println(list);
		
		for(Object coco:list)
		{
			Coconut cocon=(Coconut)coco;
			if(cocon.price>10.00)
			System.out.println(coco);
		}
		
		for(Coconut coco:list)
		{
			if(coco.price>10.00)
				System.out.println(coco);
		}

	}

}
