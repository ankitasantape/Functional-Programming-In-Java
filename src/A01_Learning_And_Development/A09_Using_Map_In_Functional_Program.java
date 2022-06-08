package A01_Learning_And_Development;

import java.util.List;

public class A09_Using_Map_In_Functional_Program {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		printSquaresOfEvenNumbersInListFunctional(numbers);
	}
	
	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
        // What to do ?
		numbers.stream() // Convert to Stream
		   .filter(number -> number % 2 == 0) // Lambda Expression 
		   // mapping - x -> x * x
		   // mapper lambda expressions : it takes x or take any number so once you have the number we can actually multiply the numbers
		   .map(number -> number * number)
		   .forEach(System.out::println); // Method Reference
	}

}
