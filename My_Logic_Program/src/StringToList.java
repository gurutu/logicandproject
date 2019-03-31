
public class StringToList {
 public static void main(String[] args) {
	String st[]="['good','MyGood']".replace("'", "").replace("[","").replace("]","").split(",");
	for (String string : st) {
		System.out.println(string);
	}
     
}
}
