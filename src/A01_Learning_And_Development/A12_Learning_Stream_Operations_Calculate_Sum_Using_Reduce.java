package A01_Learning_And_Development;

import java.util.List;


public class A12_Learning_Stream_Operations_Calculate_Sum_Using_Reduce {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
	
		int sum1 = addListStructured(numbers);
		System.out.println(sum1 );
		
		int sum2 = addListFunctional(numbers);
		System.out.println(sum2 );
		
		int max = maxNumberFromList(numbers);
		System.out.println(max );
		
		int min = minNumberFromList(numbers);
		System.out.println(min );
		
	}
	
	private static int minNumberFromList(List<Integer> numbers) {
	     //  0 would be maximum value in case of -ve values
		 return numbers.stream().reduce(Integer.MAX_VALUE, (x,y) -> x<y ? x:y);
	}

	private static int maxNumberFromList(List<Integer> numbers) {
		//  0 would be maximum value in case of -ve values
		return numbers.stream().reduce(0, (x,y) -> x>y ? x:y);
	}

	private static int sum(int aggregate, int nextNumber) {
		System.out.println("Sum : " + aggregate + " , Num : " + nextNumber);
		return aggregate + nextNumber;
	}

	private static int addListFunctional(List<Integer> numbers) {
		// numbers.stream() gives one element at a time
		return numbers.stream()
				 // .reduce(0, A12_Learning_Stream_Operations_Calculate_Sum_Using_Reduce::sum);
		         // .reduce(0, (x, y) -> x+y);
		            .reduce(0, Integer::sum); // here, we are using function sum() which is defined in Integer class 
		
		    // Stream of number -> One result value
		    // then we want to combine them into a one result => One Value
		    // 0 and (a,b) -> a + b   
		    // 0 and A12_Learning_Stream_Operations_Calculate_Sum_Using_Reduce::sum    // here, we are getting a reference of static method
	}

	// In traditional method, how do you add the numbers?
	private static int addListStructured(List<Integer> numbers) {
		// how to loop ? 
		// how to store the sum ?
		int sum = 0;
		for(int i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);
		}
		
		return sum;
	}

}
