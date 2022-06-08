package A04_Java_Functional_Interfaces_And_Lambdas;

import java.util.List;
import java.util.function.Predicate;

public class A23_Behaviour_Parameterization_With_Functional_Programming {

	public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
        System.out.println("Even Numbers: ");
        filterAndPrint(numbers, x -> x%2 == 0);
        
        System.out.println("Odd Numbers: ");
        filterAndPrint(numbers, x -> x%2 != 0);
        
        System.out.println("Multiple Of Three: ");
        filterAndPrint(numbers, x -> x%3 == 0);
				                            
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
		numbers.stream()
		   .filter(predicate)
		   .forEach(System.out::println);
	}
}
