package A01_Learning_And_Development;

import java.util.List;

public class A05_Exercise1_Print_Only_Odd_Numbers {

	public static void main(String[] args) {
		printOnlyOddNumbersFromTheList(List.of(12, 9, 13, 4, 6, 2, 41, 42, 15));
		
	}

	private static void printOnlyOddNumbersFromTheList(List<Integer> numbers) {
		numbers.stream()
		   .filter(number -> number % 2 != 0) // Lambda Expression 
		   .forEach(System.out::println); // Method Reference
	
	}

}
