package A01_Learning_And_Development;

import java.util.List;

public class A04_FP01_Lambda_Function {

	public static void main(String[] args) {

		printAllNumberInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
		System.out.println("Even Numbers: ");
		printEvenNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
	}

	// Functional approach to print numbers
	private static void printAllNumberInListFunctional(List<Integer> numbers) {

		numbers.stream().forEach(System.out::println); // Syntax of Method Referencing 
	}

	// number -> number%2 == 0
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        // What to do ?
		numbers.stream()
		   .filter(number -> number % 2 == 0) // Lambda Expression 
		   .forEach(System.out::println); // Method Reference
	}

}
