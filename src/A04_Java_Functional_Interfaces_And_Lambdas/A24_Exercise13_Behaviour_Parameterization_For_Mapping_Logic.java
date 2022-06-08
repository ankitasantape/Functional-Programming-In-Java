/*

Do Behavior Parameterization for the mapping logic
List squaredNumbers = numbers.stream().map(x -> x*x).collect(Collectors.toList());




*/

package A04_Java_Functional_Interfaces_And_Lambdas;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A24_Exercise13_Behaviour_Parameterization_For_Mapping_Logic {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
//		Function<Integer, Integer> mappingFunction = x -> x*x;
//		List<Integer> squaredNumbers = mapAndCreateNewList(numbers, mappingFunction );
		
		List<Integer> squaredNumbers = mapAndCreateNewList(numbers, x -> x*x);
	
		List<Integer> cubedNumbers = mapAndCreateNewList(numbers, x -> x*x*x);
		
		List<Integer> doubledNumbers = mapAndCreateNewList(numbers, x -> x + x);
		
		System.out.println( squaredNumbers );
		
		System.out.println( cubedNumbers );
		
		System.out.println( doubledNumbers );
		
	}

	private static List<Integer> mapAndCreateNewList(List<Integer> numbers,
			Function<Integer, Integer> mappingFunction) {
		return numbers.stream()
				      .map(mappingFunction)
				      .collect(Collectors.toList());
	}

}
