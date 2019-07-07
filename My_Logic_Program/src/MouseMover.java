
import java.awt.*;
import java.util.*;


public class MouseMover{
	
	public static final int TWOMINUT =1000 *60*1;
	public static final int ONEMINUT =1000*60;
	public static final int MAX_Y=400;
	public static final int MAX_X=400;
	
	
	public static void main(String[] args) throws Exception {
	
			Robot robot=new Robot();
			Random random=new Random();
			PointerInfo a=MouseInfo.getPointerInfo();
			int X=random.nextInt(MAX_X);
			int Y=random.nextInt(MAX_Y);
			Point b=a.getLocation();
			
			int x=(int)b.getX();
			int y=(int)b.getY();
			while(true){
			   PointerInfo a2=MouseInfo.getPointerInfo();
			   Point b1=a2.getLocation();
			   x=(int)b1.getX();
			   y=(int)b1.getY();
			   if(x==X&&y==Y){
			         X=random.nextInt(MAX_X);
					 Y=random.nextInt(MAX_Y);
					 robot.mouseMove(X,Y);
					   System.out.println("Curser Move"); 
					 Thread.sleep(TWOMINUT);
			       
			   }else{
			       X=(int)b1.getX();
				   Y=(int)b1.getY();
				    System.out.println("Curser Not MOve");
				   Thread.sleep(ONEMINUT);
				  
			   }
			
			}
			
		
	}
	
}