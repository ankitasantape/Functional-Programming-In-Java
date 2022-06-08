package A01_Learning_And_Development;

import java.util.List;

public class A14_Exercise8_Cube_Every_Number_And_Find_Sum_Of_Cubes {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        int sum = CubeEveryNumberAndFindSumOfCubes(numbers);
		System.out.println(sum);	
	}

	private static int CubeEveryNumberAndFindSumOfCubes(List<Integer> numbers) {
		return numbers.stream()
		   .map(number -> number * number * number)
		   .reduce(0, Integer::sum);
		
	}

}
