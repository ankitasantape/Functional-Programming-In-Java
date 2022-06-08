package A01_Learning_And_Development;

import java.util.List;

public class A13_Exercise7_Square_Every_Number_And_Find_The_Sum_Of_Squares {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        int sum = squareEveryNumberAndFindSumOfSquares(numbers);
		System.out.println(sum);	
	}

	private static int squareEveryNumberAndFindSumOfSquares(List<Integer> numbers) {
		return numbers.stream()
		   .map(number -> number * number)
		   .reduce(0, Integer::sum);
		
	}
}
