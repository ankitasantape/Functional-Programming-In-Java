package A01_Learning_And_Development;

import java.util.Comparator;
import java.util.List;

// You can sort a stream in ascending order as well as descending order using Comparator
public class A17_Using_Comparators_To_Sort_A_Streams_With_Sorted {

	public static void main(String[] args) {
		System.out.println("Numbers in natural order : ");
		List<Integer> numbers1 = List.of( 3, 1, 2, 2, 3, 4, 5, 5, 6, 6, 7, 8, 9, 10);
		PrintNumbersInIncreasingOrder(numbers1);
		
		System.out.println("Numbers in reverse order : ");
		PrintNumbersInReverseOrder(numbers1);
		
		System.out.println("Print Strings In Sorted Order : ");
		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernates");
		printStringsInSortedOrder(courses);
		
		System.out.println("Print Strings In Reverse Order : ");
		List<String> courses2 = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernates");
		printStringsInReverseOrder(courses2);
		
		System.out.println("Print Strings In Lengthwise: ");
		List<String> courses3 = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernates");
		printStringsInLengthwise(courses3);
	}

	private static void printStringsInLengthwise(List<String> courses) {
		courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
	}

	private static void printStringsInReverseOrder(List<String> courses) {
		courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

	private static void printStringsInSortedOrder(List<String> courses) {
		courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);	
	}

	private static void PrintNumbersInIncreasingOrder(List<Integer> numbers) {
		numbers.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
	}

	private static void PrintNumbersInReverseOrder(List<Integer> numbers) {
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
