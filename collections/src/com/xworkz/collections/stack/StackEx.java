package com.xworkz.collections.stack;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
             Stack stack=new Stack();
             stack.push('A');
             stack.push('N');
             stack.push('U');
             stack.push('S');
             stack.push('H');
             stack.push('A');
             System.out.println(stack);
             stack.pop();
             System.out.println(stack);
             System.out.println(stack.peek());
             System.out.println(stack.search('A'));
             

	}

}
