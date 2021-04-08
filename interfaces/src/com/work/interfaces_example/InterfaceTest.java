package com.work.interfaces_example;

public interface InterfaceTest {
public static void main(String[] args){
	Sony sony=new Sony();
	Epson epson=new Epson();
	Computer computer=new Computer();
	computer.slot(epson);
	computer.slot(sony);
}

}
