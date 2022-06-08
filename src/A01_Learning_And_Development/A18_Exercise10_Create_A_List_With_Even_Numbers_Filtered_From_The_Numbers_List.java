package A01_Learning_And_Development;

import java.util.List;
import java.util.stream.Collectors;

public class A18_Exercise10_Create_A_List_With_Even_Numbers_Filtered_From_The_Numbers_List {

	public static void main(String[] args) {
		System.out.println("Squares of Numbers: ");
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> list = doubleList(numbers);
		System.out.println(list); 
		
		System.out.println("Even Numbers: ");
		List<Integer> list2 = evenNumbersList(numbers);
		System.out.println(list2);
	}

	private static List<Integer> evenNumbersList(List<Integer> numbers) {
		return numbers.stream()
				.filter(number -> number % 2 == 0)
				.collect(Collectors.toList());
		
	}

	private static List<Integer> doubleList(List<Integer> numbers) {
		
		// .collect() method collects all the numbers return from map, we can store them into list, map or set
		return numbers.stream()
				.map(number -> number * number)
				.collect(Collectors.toList());
		
	}
}
