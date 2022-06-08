/*
Problem 1: Traditional Approach
Print each element from list on its own line

List.of is introduced in Java 9.
In Java 8, Arrays.asList is a good alternative.

*/

package A01_Learning_And_Development;

import java.util.List;

public class A01_FP01Structured {

	public static void main(String[] args) {
		
		printAllNumberInListStructured(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
		printEvenNumbersInListStructured(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
	}

	// Structured approach to print numbers
	private static void printAllNumberInListStructured(List<Integer> numbers) {
		//How to loop the numbers?
		for(int number : numbers) {
			System.out.println(number);
		}
	}
	
	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        // How to loop the numbers?
		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.print(number + " ");
			}
		}
	}

}
