package com.byju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Tunament {
public static void main(String[] args) throws IOException {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int no = Integer.parseInt(br.readLine()); 
      StringBuilder sb=new StringBuilder();
      for (int i = 0; i < no; i++) {
		String n1=br.readLine();
		String str=br.readLine();
		char ch[]=str.toCharArray();
		Map<Character,Integer> mp=new HashMap<Character,Integer>();
		for (int j = 0; j < ch.length; j++) {
			Integer val=mp.get(ch[j]);
			if(val!=null) {
				mp.put(ch[j],val+1);
			}else {
				mp.put(ch[j], 1);
			}
		}
		String str1=br.readLine();
		char ch1[]=str1.toCharArray();
		int count=0;
		for (int j = 0; j < ch1.length; j++) {
			Integer val=mp.get(ch1[j]);
			if(val!=null&&val!=0) {
				mp.put(ch1[j],val-1);
				count++;
			}
		}
		sb.append(count+"\n");
		
		
	} 
      System.out.println(sb);
      
      
}
}
