package A01_Learning_And_Development;

import java.util.List;
import java.util.stream.Collectors;

public class A19_Exercise11_List_With_Lengths_Of_All_Courses_Title {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernates");
        List<Integer> list = listWithLengthsOfAllCourseTitles(courses);
 		System.out.println(list);
	}

	private static List<Integer> listWithLengthsOfAllCourseTitles(List<String> courses) {
		
		return courses.stream()
				.map(course -> course.length())
				.collect(Collectors.toList());
	}

}
