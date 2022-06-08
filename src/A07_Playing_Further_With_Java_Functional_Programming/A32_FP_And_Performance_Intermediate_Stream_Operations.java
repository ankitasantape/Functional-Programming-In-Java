package A07_Playing_Further_With_Java_Functional_Programming;

import java.util.List;

public class A32_FP_And_Performance_Intermediate_Stream_Operations {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernates");
		
		System.out.println(
				  courses.stream().filter(course -> course.length() > 11).map(String::toUpperCase).findFirst()
				);
		// Output: Optional[MICROSERVICES]
		
		// it will print nothing
		courses.stream().peek(System.out::println).filter(course -> course.length() > 11).map(String::toUpperCase).peek(System.out::println);
		
		// peek(), filter(), map() all are intermediate function and they all are lazy so they are not really executed we are executing this piece of code 
		// they are only executed when we execute the terminal operation which is the -> findFirst() 
		// Java executes this entire set of code only when it knows the expected result.
		
		courses.stream().peek(System.out::println).filter(course -> course.length() > 11).map(String::toUpperCase).peek(System.out::println).findFirst();
	   
		/* Output:
		  Spring
          Spring Boot
          API
          Microservices
          MICROSERVICES
          	
		*/
		
		// So, when we are executing the intermediate operation nothing will executed, nothing will printed on to the console
		
		
	}

}
