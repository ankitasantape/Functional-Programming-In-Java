package A01_Learning_And_Development;

import java.util.List;

public class A07_Exercise3_Print_Courses_Containing_The_Word_Spring {

	public static void main(String[] args) {
		
		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernates");
		printAllTheCoursesContainingTheWordSpring(courses);
		
	}

	private static void printAllTheCoursesContainingTheWordSpring(List<String> courses) {
		courses.stream()
		   .filter(course -> course.contains("Spring"))
		   .forEach(System.out::println);
		
	}

}
