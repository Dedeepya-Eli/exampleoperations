package filecreation;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class program_2 {
	public static void main(String[] args) {
		List<String> l = Arrays.asList("name", "hat", "puppy");
		 IntStream s = IntStream.of(1,2);
		IntStream t = IntStream.range(1,2);
		l.stream()
		.map(String::toUpperCase)
		.filter(name ->name.startsWith("H")).sorted()
		.forEach(System.out::println);
		
		
	}

}
