package Day_12;

import java.util.ArrayList;
import java.util.ListIterator;

public class listinteger {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println(a);
		ListIterator<Integer> l = a.listIterator();
		while(l.hasNext()) {
			System.out.println("Index :" +l.nextIndex() +"Name :" +l.next());
			
		}
		while(l.hasPrevious() ) {
			System.out.println("Index :" +l.previousIndex() +"Name :" +l.previous());
			
		}
		while(l.hasNext()) {
			Integer i = l.next();
			if(i==3) {
				l.set(8);
				l.add(48);
			}
			if(i==5) {
				l.remove();
			}
			}
		System.out.println(a);
	}

}
