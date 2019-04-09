package com.thoughtwork;
// Java program to check if it two 
// half of string contain same Character 
// set or not 
public class GFG { 

	static final int MAX_CHAR = 26; 
	
	// function to check both halves 
	// for equality 
	static boolean checkCorrectOrNot(String s) 
	{ 
		// Counter array inisialized with 0 
		int[] count = new int[MAX_CHAR]; 
	
		// Length of the string 
		int n = s.length(); 
		if (n == 1) 
			return true; 
	
		// traverse till the middle element 
		// is reached 
		for (int i = 0,j = n - 1; i < j; i++, j--) 
		{ 
			// First half 
			count[s.charAt(i) - 'a']++; 
	
			// Second half 
			count[s.charAt(j) - 'a']--; 
		} 
	
		// Checking if values are different 
		// set flag to 1 
		for (int i = 0; i < MAX_CHAR; i++) 
			if (count[i] != 0) 
				return false; 
	
		return true; 
	} 
	
	// Driver program to test above function 
	public static void main(String args[]) 
	{ 
		// String to be checked 
		String s = "abab"; 
	
		if (checkCorrectOrNot(s)) 
			System.out.println("Yes"); 
		else
		System.out.println("No"); 
	} 
} 
// This code is contributed by Sumit Ghosh 
