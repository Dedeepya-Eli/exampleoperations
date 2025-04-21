package Day_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

public class collections {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> a1 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		a.add(1);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
		Collections.shuffle(a);
		System.out.println(a);
		System.out.println(Collections.min(a));
		System.out.println(Collections.max(a));
	}
}
