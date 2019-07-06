package com.generic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface A<T>{
	 int add(T a,T b);
	 boolean equals(Object obj);
     String toString();
 	
}

public class App  {
	
	
	public  <T> List<T> getDouble(){
		List<T> ls=new  ArrayList<>();
		ls.add((T)new Double(23));
		return ls;
		//Comparator<T>
	}
	
	public static <T> void main(String[] args) {
       List<? extends T> list=new App().getDouble();
       for (Object object : list) {
		System.out.println(object);A a1=(a, b)-> 12;
	    System.out.println(a1.add(12, 12)); ;
	}
       
       
     
      
       
	}

	
}
