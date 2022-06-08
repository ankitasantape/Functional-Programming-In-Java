package A01_Learning_And_Development;

import java.util.List;

public class A08_Exercise4_Print_Courses_Whose_Name_Has_Atleast_4_Letters {

    public static void main(String[] args) {
 		
    	List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernates");
		printAllTheCoursesWhoseNameHasAtleast4Letters(courses);
		
	}

	private static void printAllTheCoursesWhoseNameHasAtleast4Letters(List<String> courses) {
		courses.stream()
		   .filter(course -> course.length() >= 4)
		   .forEach(System.out::println);
		
	}

}
