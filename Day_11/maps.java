package Day_11;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class maps {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		Map<Integer, String> mt = new TreeMap<Integer, String>();
		m.put(1, "one");
		m.put(2, "two");
		m.put(3, "three");
		mt.put(4, "four");
		mt.put(5, "five");
		System.out.println(m);
		System.out.println(m.get(3));
		System.out.println(m.containsKey(3));
		System.out.println(m.containsValue("three"));
		m.remove(3);
		System.out.println(m);
		System.out.println(mt);
		
	}

}
