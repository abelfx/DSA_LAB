package com.itsc.package4;

import java.util.Arrays;

public class bubblesort {
	public static void main(String[] args) {
		// I used sample data here
		char[] alphabets = {'E','D','C','B','A','J', 'A', 'W', 'K', 'Z'};
		
		bubblesort(alphabets);
		
		System.out.println(Arrays.toString(alphabets));	
	}
	
	public static void bubblesort(char[] alphabet) {
		for(int i = 0; i < alphabet.length; i++) {
			char temp = alphabet[i];
			for(int j = 0; j < alphabet.length - 1; j++) {
				if(alphabet[j] > alphabet[j+1]) {
					temp = alphabet[j];
					alphabet[j] = alphabet[j+1];
					alphabet[j+1] = temp;
				}
			}
		}
	}

}
