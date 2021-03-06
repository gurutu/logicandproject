
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SocietGeneral {
    
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    
	    int T = Integer.parseInt(br.readLine());
	    StringBuilder output = new StringBuilder();
	    while (T-->0) {
	    	Map<String,Integer> m=new HashMap<String,Integer>();
	    	int No = Integer.parseInt(br.readLine());
	    	for (int i = 0; i < No; i++) {
	    		String st=br.readLine();
	    		if(st.split(" ")[0].equals("top")) {
	    			int no=Integer.parseInt(st.split(" ")[1]);
	    			output.append(changeHashMap(m,no)+"\n");
	    			
	    		}else {
				Integer va=m.get(st);
				if(va!=null) {
					m.put(st, va+1);
				}else {
					m.put(st, 1);
				}
	    		}
			}
	  
	  }
	    System.out.println(output);
	}

	private static StringBuilder changeHashMap(Map<String, Integer> m, int no) {
		Map<String,Integer> m1=new TreeMap<String,Integer>(Collections.reverseOrder());
		Map<String,Integer> m2=new HashMap<String,Integer>();
    	for(Map.Entry<String, Integer> entry:m.entrySet()) {
    		m1.put(entry.getValue()+"-"+entry.getKey(),entry.getValue());
    		Integer va=m2.get(String.valueOf(entry.getValue()));
    		if(va!=null) {
    			m2.put(String.valueOf(entry.getValue()), va+1);
    		}else {
    			m2.put(String.valueOf(entry.getValue()), 1);
    		}
    	}
    	
    	 
		return getMainMethod(m1,m2,no);
	}

	private static StringBuilder getMainMethod(Map<String, Integer> m1, Map<String, Integer> m2, int no) {
		List<String> li=new ArrayList<>(m1.keySet());
		StringBuilder sb=new StringBuilder();
		int count=0;
		for(int i=0;i<li.size();i++) {
			String v1=li.get(i).split("-")[0];
			Integer j=m2.get(v1);
			for(int j2=j+i-1;j2>=i;j2--) {
				sb.append(li.get(j2).split("-")[1]+" ");
				if(count==no-1) {
				break;	
				}
				count++;
			}
			if(count==no-1) {
				break;
			}
			i=j+i-1;
		}
		return sb;
	}
}

