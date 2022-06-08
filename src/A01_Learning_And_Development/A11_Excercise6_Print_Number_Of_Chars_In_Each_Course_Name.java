package A01_Learning_And_Development;

import java.util.List;

public class A11_Excercise6_Print_Number_Of_Chars_In_Each_Course_Name {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernates");
		printTheNumberOfCharactersInEachCourseName(courses);
 		
	}

    private static void printTheNumberOfCharactersInEachCourseName(List<String> courses) {
		
    	// In functional programming, first convert it into the stream and then just print it out.
    	courses.stream()
		   .map(course -> course + " -> " + course.length())
		   .forEach(System.out::println); // Syntax of Method Referencing   
	}

}
