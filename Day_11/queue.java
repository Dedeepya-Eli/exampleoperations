package Day_11;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		q.add("pizza");
		q.offer("burger");
		q.add("fries");
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
	}

}
