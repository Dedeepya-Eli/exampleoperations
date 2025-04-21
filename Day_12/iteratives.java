package Day_12;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratives {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		ArrayList<String> li1 = new ArrayList<String>();
		li.add(2);
		li.add(4);
		li.add(6);
		li.add(8);
		li.add(10);
		li1.add("one");
		li1.add("three");
		li1.add("five");
		li1.add("seven");
		System.out.println(li);
		System.out.println(li1);
		Iterator<Integer> i = li.iterator();
		while(i.hasNext()) {
			Integer i1 = i.next();
			System.out.println(i1);
			if(i1==6) {
				System.out.println("removing an element 6");
				i.remove();
			}
			
		}
		System.out.println(li);
		Iterator<String> s = li1.iterator();
		System.out.println(li1);
		while(s.hasNext() ) {
			String s1 = s.next();
			if(s1.equals("five")) {
				System.out.println("removing an element five");
				s.remove();
			}
		}
		System.out.println(li1);
	}

}
