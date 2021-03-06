

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
 public static void main(String[] args) {
	TreeSet<Temp> t=new TreeSet<>();
	t.add(new Temp("Hell", 1));
	t.add(new Temp("aell", 2));
	t.add(new Temp("fell", 3));
	t.add(new Temp("a1ell", 4));
	Set<String> se = new LinkedHashSet<>();
	System.out.println(se.add("Ram"));
	System.out.println(se.add("Ram"));
	System.out.println(se.add("Ram"));
	System.out.println(se.add("Ram"));
	
	
	
		/*
		 * for (Map.Entry<String, Integer> entry : t.entrySet())
		 * System.out.println("Key = " + entry.getKey() + ", Value = " +
		 * entry.getValue());
		 */
	
	//System.out.println(t.toString());
	
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
