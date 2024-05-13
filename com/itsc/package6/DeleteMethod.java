package com.itsc.package6;

import java.util.Arrays;

public class DeleteMethod {
	
	public static int[] DeleteElement(int[] array, int index) {
		// I used another array here
		int[] array2 = new int[array.length - 1];
		if(index >=0 && index <= array.length) {
			for(int i = 0; i < index; i++) {
				array2[i] = array[i];
			}
			for(int i = index; i < array.length - 1;i++) {
				array2[i] = array[i+1];
			}
		}
		else {
			System.out.println("invalid index");
			return array;
		}
		
		return array2;
	}
	
	public static void main(String[] args) {
		
		int[] array = {3,7,1,9,4};
		
		System.out.println(Arrays.toString(DeleteElement(array, 10)));
		
	}

}
