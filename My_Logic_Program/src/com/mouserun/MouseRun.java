package com.mouserun;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.util.Random;

public class MouseRun {
	
	
	
	public static void main(String[] args) throws Exception {
		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		int x = (int) b.getX();
		int y = (int) b.getY();
		Random r=new Random();
		int X=x;
		int Y=y;
		while(true) {
			 a = MouseInfo.getPointerInfo();
			 b = a.getLocation();
			
			int p1=(int)r.nextInt(400);
			int p2=(int)r.nextInt(400);
			if(x==X&&y==Y) {
				Robot r1 = new Robot();
				
				r1.mouseMove(p1,p2);
				//System.out.printf("Yes Move X=%s,Y=%s \n",X,Y);//("Yes Move X=");
				 X= p1;
				 Y = p2;
			}else {
				    X=x;
				    Y=y;
					//System.out.printf("No move X=%s,Y=%s = x=%s,y=%s \n",X,Y,x,y);
				
				
				
				
			}
			 x = (int) b.getX();
			 y = (int) b.getY(); 
			 Thread.sleep(1000*20*1);
			
		}
		
	}
}
