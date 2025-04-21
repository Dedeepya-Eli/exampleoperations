package Day_11;

import java.util.LinkedList;
import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.add("teju");
		s.add("dedee");
		s.add("harshi");
		s.addLast("sanjay");
		System.out.println(s);
		System.out.println(s.push("rohini"));
		System.out.println(s.peek());
		System.out.println(s.pop());
	}

}
