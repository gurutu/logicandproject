package com.thoughtwork;

import java.util.LinkedList;

public class AddValueInSortedList {
 public static void main(String[] args) {
	 int v=1000000000;
	LinkedList<Integer> list=new LinkedList<>();
	list.add(3);
	list.add(7);
	int value=10;
	int length =list.size();
	if(list.get(length-1)<value) {
		list.add(length,value);
	}else if(list.get(0)>value) {
		list.add(0,value);
	}else {
		for (int i = 0; i < length-1; i++) {
			int v1=list.get(i);
			int v2=list.get(i+1);
			if(v1<value&&value<v2) {
				list.add(i+1,value);
				break;
			}
		}
	}
	
	
	System.out.println(list);
}
}
