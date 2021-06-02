package com.xworkz.collections;

public class Coconut {
String name;
int size;
double price;
double weight;


public Coconut(String name, int size, double price, double weight) {
	
	this.name = name;
	this.size = size;
	this.price = price;
	this.weight = weight;
}


@Override
public String toString() {
	return "Coconut [name=" + name + ", size=" + size + ", price=" + price + ", weight=" + weight + "]";
}





}
