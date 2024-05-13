package com.itsc.package3;

import java.util.Arrays;

public class Stack { 
		
	int top;
	int maxsize;
	int[] array;
	
	Stack(int size){
		maxsize = size;
		top = -1;
		array = new int[maxsize];
	}
	
	public boolean isempty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	
	public boolean isfull() {
		if(top == maxsize) {
			return true;
		}
		return false;
	}
	
	// adding operation(push)
	public void push(int value) {
		if(!isfull()) {
			array[++top] = value;
		}
		else {
			System.out.println("stack is full");
		}
	}
	
	public int pop() {
		if(!isempty()) {
			int data = array[top--];
			maxsize--;
			return data;
		}
		return -1;
	}
	
	public int peek() {
		if(top >= 0) {
			return array[top];
		}
		return -1;
			
	}

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		
		System.out.println(stack.isempty());
		System.out.println(stack.isfull());
		
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		
		System.out.println("First element: " + stack.array[0]);
		
		stack.pop();
		
		for(int i = 0; i< 4; i++) {
			System.out.print(stack.pop() + " ");
		}
		
	}
}
