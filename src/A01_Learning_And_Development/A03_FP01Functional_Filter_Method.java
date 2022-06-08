/*
Problem 1: Functional Approach -> Functional Approach is much more complex than the Structured Approach
Print each element from list on its own line

List.of is introduced in Java 9.
In Java 8, Arrays.asList is a good alternative.


*/

package A01_Learning_And_Development;

import java.util.List;

public class A03_FP01Functional_Filter_Method {

	public static void main(String[] args) {

		printAllNumberInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
		System.out.println("Even Numbers: ");
		printEvenNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
	}

	// Functional approach to print numbers
	private static void printAllNumberInListFunctional(List<Integer> numbers) {
		
		numbers.stream().forEach(System.out::println); // Syntax of Method Referencing   
	}

	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        // How to loop the numbers?
		numbers.stream() // Convert to Stream
		   .filter(number -> number % 2 == 0) // Lamdba Expression
		   .forEach(System.out::println);// Method Reference
	}

}
