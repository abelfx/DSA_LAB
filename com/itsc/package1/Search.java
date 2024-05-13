package com.itsc.package1;

import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the Array: ");
		int length = input.nextInt();
		
		// initialize array
		int[] array = new int[length];
		
		System.out.println("Enter the elements in the Array: ");
		for(int i = 0;  i< length; i ++) {
			int j = i+1;
			System.out.println("Element " + j + ": ");
			int elements = input.nextInt();
			array[i] = elements;
		}
		
		// Enter element
		System.out.println("Enter number to be search: ");
		int searched = input.nextInt();
		
		// search to check for the element
		int frequency = 0;
		boolean found = false;
		for(int i = 0; i < length; i++) {
			if(array[i] == searched ) {
				found = true;
				frequency++;
			}
		}
		
		if(found == true) {
			System.out.println("Element is found!");
			System.out.println("frequency: " + frequency);
		}
		else {
			System.out.println("Element not found!");
		}
		
	}

}
