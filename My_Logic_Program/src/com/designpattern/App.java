package com.designpattern;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class App {
 public static void main(String[] args) {
	TreeSet<Temp> t=new TreeSet<>();
		/*
		 * t.add(new Temp("Hell", 1)); t.add(new Temp("aell", 1)); t.add(new
		 * Temp("fell", 1)); t.add(new Temp("a1ell", 1));
		 */
	
	for (Temp temp : t) {
		System.out.println(temp.toString());
	}
	
		/*
		 * for (Map.Entry<String, Integer> entry : t.entrySet())
		 * System.out.println("Key = " + entry.getKey() + ", Value = " +
		 * entry.getValue());
		 */
	
	//System.out.println(t.toString());
	
}
}


/*
 * class Temp implements Comparator<Temp>{ private String name; private Integer
 * count;
 * 
 * 
 * 
 * @Override public String toString() { return "Temp [name=" + name + ", count="
 * + count + "]"; } public Temp(String name, Integer count) { this.name = name;
 * this.count = count; } public String getName() { return name; } public void
 * setName(String name) { this.name = name; } public Integer getCount() { return
 * count; } public void setCount(Integer count) { this.count = count; }
 * 
 * @Override public int compare(Temp o1, Temp o2) { if(o1.count==o2.count) {
 * return o1.name.compareTo(name); }else { return o1.name.compareTo(name); } }
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 */