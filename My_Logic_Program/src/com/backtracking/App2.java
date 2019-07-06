package com.backtracking;

import java.util.Arrays;

public class App2 {
public static void main(String[] args) {
	int arr1[]= {2,3,-1,-4};
	int arr2[]= {4,-5,1,2};
	System.out.println(Arrays.toString(mergeArrays(arr1,arr2)));;
}

public static int[] mergeArrays(int[]arr1,int[]arr2){
	   int l1=arr1.length;
	   int l2=arr2.length;
	   int count=0;
	   int arr[]=new int[l1+l2];
	   for(int i=0;i<l1+l2;i++){
	       if(i<l1){
	           arr[i]=arr1[i];
	       }else{
	           arr[i]=arr2[count++];
	       }
	   }
	   Arrays.sort(arr);
		return arr;
	}
}
