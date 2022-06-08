package A01_Learning_And_Development;

import java.util.List;
import java.util.stream.Collectors;

public class A20_Intermediate_And_Terminal_Stream_Operations {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		numbers.stream()
		     .distinct() // Stream<T> Intermediate
		     .sorted() // Stream<T>
		     .forEach(System.out::println); // void
		
		List<Integer> evenNumbers = numbers.stream()
				.filter(number -> number % 2 == 0) // Stream<R>
				.collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		List<Integer> squareNumbers = numbers.stream()
				.map(number -> number * number) // Stream<T>
				.collect(Collectors.toList());
		System.out.println(squareNumbers);
		
	}

}
