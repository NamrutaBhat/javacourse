package com.work.java.polymorphism.compile_time;

public class CompileTimeExOfMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human=new Human();
			human.speak(new Friend());
			human.speak(new Stranger());


	}

}
