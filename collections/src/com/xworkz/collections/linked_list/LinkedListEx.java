package com.xworkz.collections.linked_list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<String>();
	list.add("paracitomal");
	list.add("dolo");
	list.add("rantac");
	list.add("montac");
	list.add("anacin");
	
	System.out.println(list);
	list.addFirst("e");
	list.add("a");
	list.add("n");
	list.add("u");
	list.addLast("a");
	list.removeFirst();
	list.removeLast();
	list.getFirst();
	list.getLast();
	System.out.println(list);
	
	
	ListIterator<String> listIterator=list.listIterator();
	while(listIterator.hasNext()){
		String obj=listIterator.next();
		
		if(obj.equals("anacin")){
			listIterator.add("Telma");
		}
		if(obj.equals("montac")){
			listIterator.set("Tribet");
		}
		
		if(obj.equals("dolo")){
			listIterator.remove();
	}
	

	}
	System.out.println(list);

}
}
