package com.ocjp;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Logic1 {
 public static void main(String[] args) {
	Set<String> st=new TreeSet<>(new Comparator<String>() {
		public int compare(String o1, String o2) {
			return o2.compareTo(o1);
		};
	});
	st.add("A");
	st.add("B");
	st.add("E");
	st.add("K");
	st.add("F");
	st.add("Z");
	st.add("L");
	
	for (String string : st) {
		System.out.println(string);
	}
}
}
