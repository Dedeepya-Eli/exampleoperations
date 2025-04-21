package Day_11;

import java.util.LinkedHashSet;

public class hashlinkedlist {
	public static void main(String[] args) {
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		lh.add("dedee");
		lh.add("indhu");
		lh.addAll(lh);
		System.out.println(lh);
		lh.addLast("eli");
		System.out.println(lh);
		lh.addFirst("srav");
		System.out.println(lh);
	    System.out.println(lh.size());
	    lh.removeLast();
	    System.out.println(lh);
		lh.clone();
	}

}
