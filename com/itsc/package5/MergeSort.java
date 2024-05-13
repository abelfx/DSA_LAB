package com.itsc.package5;

import java.util.Arrays;

public class MergeSort {
	
	public static void mergesort(int[] array) {
		int length = array.length;
		if (length == 1) return;
		
		int middle = length/2;
		
		int[] leftarray = new int[middle];
		int[] rightarray = new int[length - middle];
		
		for(int i = 0; i<middle; i++) {
			leftarray[i] = array[i];
		}
		
		for(int i = middle; i<length; i++) {
			rightarray[i-middle] = array[i];
		}
		
		mergesort(leftarray);
		mergesort(rightarray);
		
		merge(array, leftarray, rightarray);
		
	}
	
	public static void merge(int[] array, int[] leftarray, int[] rightarray) {
		int leftlength = leftarray.length;
		int rightlength = rightarray.length;
		
		/* i = index of left array
		 * j = index of right array
		 * k = index of the main array
		 */
		
		int i = 0; int j = 0; int k = 0;
		
		while(i < leftlength && j < rightlength) {
			if (leftarray[i] <= rightarray[j]) {
				array[k] =  leftarray[i];
				i++;
			}
			else {
				array[k] = rightarray[j];
				j++;
			}
			k++;		
		}
		
		while(i<leftlength) {
			array[k] = leftarray[i];
			i++;
			k++;
		}
		while(j<rightlength) {
			array[k] = rightarray[j];
			j++;
			k++;
		}
		
	}
	
	public static void main(String[] args) {
		// #1 Question sample data;
		
		int[] array = {10,1,5,7,9,4,3,6,8,2};
		
		mergesort(array);
		
		System.out.println(Arrays.toString(array));
	}

}
