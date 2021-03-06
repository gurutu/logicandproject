package com.designpattern;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SocietGeneral {
    
 
	static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
 
        public InputReader(InputStream stream) {
            this.stream = stream;
        }
 
        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }
 
        public String readLine() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndOfLine(c));
            return res.toString();
        }
 
        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }
 
        public long readLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
 
        public int readInt() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
 
        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
 
        public boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }
    }
 
    static class OutputWriter {
        private final PrintWriter writer;
 
        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
                    outputStream)));
        }
 
        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }
 
        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0)
                    writer.print(' ');
                writer.print(objects[i]);
            }
        }
 
        public void printLine(Object... objects) {
            print(objects);
            writer.println();
        }
 
        public void close() {
            writer.close();
        }
    }
    
	public static void main(String[] args) {
		
		InputReader in = new InputReader(System.in);
	    OutputWriter out = new OutputWriter(System.out);
	    
	    int T = in.readInt();
	    StringBuilder output = new StringBuilder();
	    while (T-->0) {
	    	Map<String,Integer> m=new HashMap<String,Integer>();
	    	for (int i = 0; i < args.length; i++) {
	    		String st=in.readLine();
	    		if(st.split(" ")[0]=="top") {
	    			output.append(changeHashMap(m)+"\n");
	    			
	    		}else {
				Integer va=m.get(st);
				if(va!=null) {
					m.put(st, va+1);
				}else {
					m.put(st, 1);
				}
	    		}
			}
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
//	    	 Map<String,Integer> m=new HashMap<>();
//	    	 TreeSet<Temp> m2=new TreeSet<>();
//	    	 int no = in.readInt();
//	    	 for(int i=0;i<no;i++) {
//	    		 String N = in.readString();
//	    		 int no1=0;
//	    		if(N.equals("top")) {
//	    			 no1 = in.readInt(); 
//	    			 output.append(outputData(m2,no1,output)).append("\n");
//	    		 }else {
//	    		 Integer va=m.get(N);
//	    		 if(va!=null) {
//	    			 m.put(N, va+1);
//	    			 m2.add(new Temp(N,va+1));
//	    		 }else {
//	    			 m.put(N, 1);
//	    			 m2.add(new Temp(N,1));
//	    		 }
//	    		 }
//	    	 }
//	    	
	    }
	    out.printLine(output);
    	out.close();
	}

	private static StringBuilder changeHashMap(Map<String, Integer> m) {
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
    	
    	 
		return getMainMethod(m1,m2);
	}

	private static StringBuilder getMainMethod(Map<String, Integer> m1, Map<String, Integer> m2) {
		List<String> li=new ArrayList<>(m1.keySet());
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<li.size();i++) {
			String v1=li.get(i).split("-")[0];
			Integer j=m1.get(v1);
			for(int j2=j+i-1;j2>=i;j2--) {
				sb.append(li.get(j2)+" ");
			}
			i=j+i-1;
		}
		return sb;
	}

	private static String outputData(TreeSet<Temp> m2, int no1, StringBuilder output) {
		int count=0;
		Set<String> se = new LinkedHashSet<>();
		String st="";
		for (Temp temp : m2) {
			
			if(se.add(temp.getName())) {
				st+=temp.getName()+" ";
				count++;
			}
			if(count==no1)break;
			
		}
		//String[] st = new String[se.size()];
		//se.toArray(st);
		return st;
	}
 
	
 
}


class Temp implements Comparable<Temp>{
	private String name;
	private Integer count;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((count == null) ? 0 : count.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temp other = (Temp) obj;
		if (count == null) {
			if (other.count != null)
				return false;
		} else if (!count.equals(other.count))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Temp [name=" + name + ", count=" + count + "]";
	}
	public Temp(String name, Integer count) {
		this.name = name;
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}

	
	@Override
	public int compareTo(Temp o) {
		if(this.count<o.count) {
			return 1;
		}else if(this.count>o.count) {
			return -1;
		}else {
			 return this.name.compareTo(o.name); 
		}

		
	}
	
}