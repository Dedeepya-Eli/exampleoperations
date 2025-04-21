package Day_11;

import java.util.LinkedList;

public class linkedlist {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("list");
		ll.add("queue");
		ll.add("priority");
		ll.addAll(ll);
		System.out.println(ll);
	}

}
