package Day_11;

import java.util.HashSet;

public class set {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		HashSet<String> hs = new HashSet<String>();
		h.add("sets");
		h.add("allow");
		h.equals("sets");
		hs.add("the");
		hs.add("duplicate");
		hs.add("set");
		h.remove(hs);
		System.out.println(h);
		System.out.println(hs);
		h.clone();
		
	}

}
