/*
Problem 1: Functional Approach -> Functional Approach is much more complex than the Structured Approach
Print each element from list on its own line

List.of is introduced in Java 9.
In Java 8, Arrays.asList is a good alternative.


*/

package A01_Learning_And_Development;

import java.util.List;

public class A02_FP01Functional {

    public static void main(String[] args) {
		
		printAllNumberInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
		printEvenNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 8, 1, 15));
		
	}
    
    private static void print(int number) {
    	System.out.println(number);
    }
    
    private static boolean isEven(int number) {
    	return number%2 == 0;
    }
    
	// Functional approach to print numbers
	private static void printAllNumberInListFunctional(List<Integer> numbers) {
		//[12, 9, 13, 4, 6, 2, 4, 12, 15]
		//12
		//9
		//13
		//4
		//.....
		
		//What to do?
		//What we are doing here?
		//-> Hey, take the numbers and convert it into the stream, and for each element 12, 9, 13, ... do a print.
		
		
		// Instead of getting a list like this -> list[12, 9, 13, 4, 6, 2, 4, 12, 15]
		// we can get a stream of element like this
		// 12
		// 9
		// 13
		// 4
		// ...
		
		
		System.out.println("Printing Numbers with Method Referencing: ");
		
		// We are calling print() method which is present in the current class 
		// If you want to call any specific static method in that particular class and this static method is called with that element, so this stream contains a list of numbers.
		// So first 12 will send to this method print()
		// next, 9 will send to this method print() and like this it will goes on
		
		numbers.stream()
		  .forEach(A02_FP01Functional::print); // Syntax of Method Referencing
		
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		
		// Here, instead of doing A02_FP01Functional::print this we can do this -> System.out::println. So here, println() is a static method. Here, System.out contains println() method
		numbers.stream()
		  .forEach(System.out::println); // Syntax of Method Referencing
		// Instead of creating new method print() we can call inbuilt method println()
		
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        // What to do ?
		// here, we get a list of numbers
		numbers.stream()
		    // Filter - Only Allow Even Numbers
	     	// We are not calling it we are just saying it that
		    // this is the method to be called on each of this numbers 
		    // and if it returns true back only then go to the next line
		    .filter(A02_FP01Functional::isEven)
		    .forEach(System.out::println);
		
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
		
		numbers.stream()
		       .filter(number -> number%2 == 0)
		       .forEach(System.out::println);
/*
Output: 
		 
12
4
6
2
8

*/
		
	}
	
}
