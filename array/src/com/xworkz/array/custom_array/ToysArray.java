package com.xworkz.array.custom_array;

public class ToysArray {

	public static void main(String[] args) {
		Toy car=new Toy("car","red",100.00);
		Toy teddy=new Toy("teddy","orange",500.00);
		Toy ball=new Toy("ball","blue",50.00);
		Toy dog=new Toy("dog","black",250.00);
		
		Toy toys[]={car,teddy,ball,dog};
		
		for(int i=0;i<toys.length;i++){
			System.out.println(toys[i].name);
		}

		System.out.println("toys with price>100");
		
		for(int i=0;i<toys.length;i++){
			if(toys[i].price>100){
			System.out.println(toys[i]);
	
			}
			}
		
		
	}

}
