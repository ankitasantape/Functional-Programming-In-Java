package A01_Learning_And_Development;

import java.util.List;

public class A16_Distinct_And_Sorted {

	public static void main(String[] args) {
		System.out.println("Distinct Numbers : ");
		List<Integer> numbers1 = List.of( 3, 1, 2, 2, 3, 4, 5, 5, 6, 6, 7, 8, 9, 10);
		PrintDistinctNumbers(numbers1);
		
		System.out.println("Numbers In Sorted : ");
		List<Integer> numbers2 = List.of( 2, 1, 1, 3, 6, 7, 8, 10, 4, 4, 5, 9);
		PrintNumbersInSortedOrder(numbers2);
		
		System.out.println("Numbers In Sorted And Distinct : ");
		List<Integer> numbers3 = List.of( 2, 1, 1, 3, 6, 7, 8, 10, 4, 4, 5, 9);
		PrintDistinctNumbersAndInSortedOrder(numbers3);
		
		System.out.println("Print Strings In Sorted Order : ");
		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernates");
		printStringsInSortedOrder(courses);
		
		System.out.println("Print Strings In Distinct Manner : ");
		List<String> courses2 = List.of("Spring","Spring","Spring","Sprint Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernates");
		printStringsInDistinctOrder(courses2);
		
		System.out.println("Print Strings In Sorted And Distinct : ");
		List<String> courses3 = List.of("Spring","Spring","Sprint Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernates","Kubernates");
		printStringsInSortedAndDistinctOrder(courses3);
	}
	
	private static void printStringsInSortedAndDistinctOrder(List<String> courses) {
		courses.stream().sorted().distinct().forEach(System.out::println);	
	}

	private static void printStringsInDistinctOrder(List<String> courses) {
		courses.stream().distinct().forEach(System.out::println);
	}

	private static void printStringsInSortedOrder(List<String> courses) {
		courses.stream().sorted().forEach(System.out::println);
	}

	private static void PrintDistinctNumbersAndInSortedOrder(List<Integer> numbers) {
		numbers.stream().distinct().sorted().forEach(System.out::println);
	}

	private static void PrintNumbersInSortedOrder(List<Integer> numbers) {
		 numbers.stream().sorted().forEach(System.out::println);
	}

	private static void PrintDistinctNumbers(List<Integer> numbers) {
		 numbers.stream().distinct().forEach(System.out::println);
	}

}
