package com.hacker.americanex;


 class HackerEarth
{ 
    public int a = 0; 

	
	 public HackerEarth(String Hack) { a = 1; }
	  
} 

public class Company extends HackerEarth
{
    public Company(String Hack)
    {
    	super(Hack);
        a = 2; 
    } 

    public static void main(String args[])
    {
    	HackerEarth comp = new HackerEarth("Hello HackerEarth"); 
        System.out.println(comp.a); 
    } 
}