package A07_Playing_Further_With_Java_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A30_Join_And_FlagMap {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernates");
		
		// Join this strings
		String str = courses.stream().collect(Collectors.joining(" "));
		System.out.println(str);
	    // Spring Sprint Boot API Microservices AWS PCF Azure Docker Kubernates

		String str1 = courses.stream().collect(Collectors.joining(", "));
		System.out.println(str1);
		// Spring, Sprint Boot, API, Microservices, AWS, PCF, Azure, Docker, Kubernates

		String[] strCharArr = "Sprint".split("");
		for(String s: strCharArr) {
		    System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println(
		    courses.stream().map(course -> course.split("")).collect(Collectors.toList()));
		
		System.out.println(
		    courses.stream().map(course -> course.split("")));
	
		// Flatmap: each element of Stream replaced with content of mapped stream 
		// Mapping Function -> (Arrays::stream)
		
		// ["S","p","r","i","n","g"] => "S","p","r","i","n","g"
		// ["A","W","S"] => "A","W","S"
		
		System.out.println( courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).collect(Collectors.toList()));   
		
		System.out.println( courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()));
		
		
		// Expected Output :- Tuples with Same Length - [[ Spring, Docker], [API, AWS], [API, PCF], [AWS, API], [AWS, PCF], [PCF, API], [PCF, AWS], [Docker, Spring]]      
		
		List<String> courses2 = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernates");
		
		
		System.out.println(
		       courses.stream().flatMap(course -> courses2.stream().map(course2 -> List.of(course, course2))).collect(Collectors.toList()));
		
		System.out.println( 
			   courses.stream().flatMap(course -> courses2.stream().map(course2 -> List.of(course, course2))).filter(list -> !list.get(0).equals(list.get(1))).collect(Collectors.toList())	);
		
		System.out.println(  
			   courses.stream().flatMap(course -> courses2.stream().filter(course2 -> course2.length() == course.length()).map(course2 -> List.of(course, course2))).filter(list -> !list.get(0).equals(list.get(1))).collect(Collectors.toList()));
	    
	
	}
 
}
