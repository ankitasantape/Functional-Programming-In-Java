package A01_Learning_And_Development;

import java.util.List;

public class A06_Exercise2_Print_All_Courses_Individually {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernates");
		printAlltheCoursesIndividuallyInListFunctional(courses);
		
	}

    private static void printAlltheCoursesIndividuallyInListFunctional(List<String> courses) {
		
    	// In functional programming, first convert it into the stream and then just print it out.
		courses.stream()
		   .forEach(System.out::println); // Syntax of Method Referencing   
	}

}
