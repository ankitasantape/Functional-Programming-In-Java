package A08_Functional_Programming_Makes_Java_Easy;

import java.util.ArrayList;
import java.util.List;

public class A34_Modifying_Lists_With_ReplaceAll_And_RemoveIf {

	public static void main(String[] args) {
		
		// replaceAll() accepts a function() as a parameter
		
		// Whatever list we created with List.of() is always an immutable 
		
		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernates");
		
		  
	   // courses.replaceAll(str -> str.toUpperCase());
		
	    // System.out.println(courses);
		
		/*  This error will come if we try to change list of string
		    Exception in thread "main" java.lang.UnsupportedOperationException
	        at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
	        at java.base/java.util.ImmutableCollections$AbstractImmutableList.replaceAll(ImmutableCollections.java:259)
	        at A08_Functional_Programming_Makes_Java_Easy.A34_Modifying_Lists_With_ReplaceAll_And_RemoveIf.main(A34_Modifying_Lists_With_ReplaceAll_And_RemoveIf.java:16)
 
		 */
	    
	    // We can use to modifyableCourses
	    
	    List<String> modifyableCourses = new ArrayList(courses);
	    
	    modifyableCourses.replaceAll(str -> str.toUpperCase());
	    
	    System.out.println( modifyableCourses );  // Output : [SPRING, SPRING BOOT, API, MICROSERVICES, AWS, PCF, AZURE, DOCKER, KUBERNATES]
	    
	    // If you want to print courses which has length greater than 6
	    
	   
	    modifyableCourses.removeIf(course -> course.length() < 6);
	    System.out.println( modifyableCourses  ); // output : [SPRING, SPRING BOOT, MICROSERVICES, DOCKER, KUBERNATES]
	    
	    
	    
	    
	    
	    
	    
	}

}
