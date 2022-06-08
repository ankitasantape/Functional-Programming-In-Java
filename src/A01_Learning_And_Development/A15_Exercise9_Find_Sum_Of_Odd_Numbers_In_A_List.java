package A01_Learning_And_Development;

import java.util.List;

public class A15_Exercise9_Find_Sum_Of_Odd_Numbers_In_A_List {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int sum = FindSumOfOddNumbers(numbers);
		System.out.println(sum);
	}

	private static int FindSumOfOddNumbers(List<Integer> numbers) {
		return numbers.stream().filter(number -> number % 2 != 0).reduce(0, Integer::sum);
	}
}
