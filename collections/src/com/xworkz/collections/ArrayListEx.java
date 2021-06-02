package com.xworkz.collections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {


		public static void main(String[] args) {
			ArrayList arrayList=new ArrayList();
			arrayList.add(1);
			arrayList.add(2);
			arrayList.add(2);
			
			arrayList.add(4);
			arrayList.add(null);
			
			ArrayList arrayList1=new ArrayList();
			arrayList1.add("namruta");
			arrayList1.add('b');
			
			
			System.out.println(arrayList.get(0));
			System.out.println(arrayList);
			System.out.println(arrayList.contains(6));
			System.out.println(arrayList.get(4));
			System.out.println(arrayList.isEmpty());
			arrayList.remove(5);
			System.out.println(arrayList);
			
			arrayList.addAll(arrayList1);
			
			arrayList.retainAll(arrayList1);
			System.out.println(arrayList);
			System.out.println(arrayList.containsAll(arrayList1));
			
			System.out.println("-------------------");
			System.out.println("iterator demo");
		Iterator iterator=	arrayList.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());

		}
		iterator.remove();

	}


}
