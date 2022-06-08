package A05_Java_Functional_Programming_With_Creating_Custom_Classes;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;
	
    public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public int getReviewScore() {
		return reviewScore;
	}
	
	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}
	
	public int getNoOfStudents() {
		return noOfStudents;
	}
	
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	
	public String toString() {
		return name + ":" + noOfStudents + ":" + reviewScore;
	}
	
}

public class A27_FP04CustomClass {

	public static void main(String[] args) {
		List<Course> courses = List.of(
				  new Course("Spring","Framework", 98, 10000),
				  new Course("Spring Boot","Framework", 97, 24000),
				  new Course("API","Microservices", 96, 22000),
				  new Course("Microservices","Microservices", 95, 21000),
				  new Course("FullStack","FullStack", 94, 12000),
				  new Course("AWS","Cloud", 93, 25000),
				  new Course("Azure","Cloud", 92, 23000),
				  new Course("Docker","Cloud", 91, 27000),
				  new Course("Kubernetes","Cloud", 90, 28000)  
				);
		
		//allMatch : All are matching
		//noneMatch : Not a single one is matching  
		//anyMatch : If any of the course is matches the predicate, even if one course is matches the predicate, then it returns the value true.
		Predicate< Course > reviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > 95;
		
		Predicate< Course > reviewScoreGreaterThan90Predicate = course -> course.getReviewScore() > 90;
		
		Predicate< Course > reviewScoreLessThan90Predicate = course -> course.getReviewScore() < 90;
		
		
		System.out.println(
				courses.stream().allMatch(reviewScoreGreaterThan95Predicate));
		
		System.out.println(
				courses.stream().noneMatch(reviewScoreGreaterThan90Predicate));
		
		System.out.println(
				courses.stream().anyMatch(reviewScoreLessThan90Predicate));
		
		Comparator<Course> comparingByNoOfStudentsIncreasing = Comparator.comparing(Course::getNoOfStudents);
		
		Comparator<Course> comparingByNoOfStudentsDecreasing = Comparator.comparingInt(Course::getNoOfStudents).reversed();
		
		
		System.out.println(
		        courses.stream().sorted(comparingByNoOfStudentsIncreasing).collect(Collectors.toList()));
		// [Spring:20000:98, Spring Boot:20000:97, API:20000:96, Microservices:20000:95, FullStack:20000:94, AWS:20000:93, Azure:20000:92, Docker:20000:91, Kubernetes:20000:90]

		System.out.println(
			    courses.stream().sorted(comparingByNoOfStudentsDecreasing).collect(Collectors.toList()));
		//Output: [Kubernetes:28000:90, Docker:27000:91, AWS:25000:93, Spring Boot:24000:97, Azure:23000:92, API:22000:96, Microservices:21000:95, FullStack:12000:94, Spring:10000:98]

		Comparator<Course> comparingByNoOfStudentsAndNoOfReviews = Comparator.comparingInt(Course::getNoOfStudents).thenComparingInt(Course::getReviewScore).reversed();
		
		System.out.println(
		        courses.stream().sorted(comparingByNoOfStudentsAndNoOfReviews).collect(Collectors.toList()));
		//Output: [Kubernetes:28000:90, Docker:27000:91, AWS:25000:93, Spring Boot:24000:97, Azure:23000:92, API:22000:96, Microservices:21000:95, FullStack:12000:94, Spring:10000:98]

		// If you want to print top-5 results
		System.out.println( 
				     courses.stream()
				    .sorted(comparingByNoOfStudentsAndNoOfReviews)
				    .limit(5)
				    .collect(Collectors.toList()));
		//Output: [Kubernetes:28000:90, Docker:27000:91, AWS:25000:93, Spring Boot:24000:97, Azure:23000:92]

		// If you want to skip top-5 results 
		System.out.println( 
			     courses.stream()
			    .sorted(comparingByNoOfStudentsAndNoOfReviews)
			    .skip(5)
			    .collect(Collectors.toList()));
		//Output: [API:22000:96, Microservices:21000:95, FullStack:12000:94, Spring:10000:98]

		// We can use both limit & skip at
		System.out.println( 
			     courses.stream()
			    .sorted(comparingByNoOfStudentsAndNoOfReviews)
			    .skip(3)
			    .limit(5)
			    .collect(Collectors.toList()));
		//Output: [Spring Boot:24000:97, Azure:23000:92, API:22000:96, Microservices:21000:95, FullStack:12000:94]

		// It will take every elements which has value >= 95
		System.out.println(
				courses.stream()
				       .takeWhile(course -> course.getReviewScore() >= 95)
				       .collect(Collectors.toList()));
		//Output: [Spring:10000:98, Spring Boot:24000:97, API:22000:96, Microservices:21000:95]

				
				
		// It will drop every elements which has value >= 95
		System.out.println(
		        courses.stream()
		               .dropWhile(course -> course.getReviewScore() >= 95)
		               .collect(Collectors.toList()));
		//Output: [FullStack:12000:94, AWS:25000:93, Azure:23000:92, Docker:27000:91, Kubernetes:28000:90]

		// It will return max value
		System.out.println(
				courses.stream()
				       .max(comparingByNoOfStudentsAndNoOfReviews));
		//Output: Optional[Spring:10000:98]
		
		// It will return min value
		System.out.println(
				courses.stream()
				       .min(comparingByNoOfStudentsAndNoOfReviews));
		//Output: Optional[Kubernetes:28000:90]

		
		System.out.println(
				courses.stream()
				       .filter(reviewScoreLessThan90Predicate)
				       .min(comparingByNoOfStudentsAndNoOfReviews));
		//Output: Optional.empty
		
		// Optional helps to return whether the element is exists or not.
		// Instead of returning empty value we can set default value
		// If there is no value to return then that time it will return default value
		System.out.println(
				courses.stream()
				       .filter(reviewScoreLessThan90Predicate)
				       .min(comparingByNoOfStudentsAndNoOfReviews)
				       .orElse(new Course("Kubernetes","Cloud", 90, 28000)));
		// Output: Kubernetes:28000:90
		
		System.out.println(
				courses.stream()
				       .filter(reviewScoreLessThan90Predicate)
				       .findFirst());
		// Output: Optional.empty
		
		
		System.out.println(
				courses.stream()
				       .filter(reviewScoreGreaterThan95Predicate)
				       .findFirst());
		// Output: Optional[Spring:10000:98]
		
		System.out.println(
				courses.stream()
				       .filter(reviewScoreGreaterThan95Predicate)
				       .findAny());
		// Output: Optional[Spring:10000:98]
		
		
		
		// PLAYING WITH SUM, AVERAGE AND COUNT
		
		System.out.println(
				courses.stream()
				       .filter(reviewScoreGreaterThan95Predicate)
				       .mapToInt(Course::getNoOfStudents)
				       .sum()); // 56000
		
		System.out.println(
				courses.stream()
				       .filter(reviewScoreGreaterThan95Predicate)
				       .mapToInt(Course::getNoOfStudents)
				       .average()); // OptionalDouble[18666.666666666668]
		
		System.out.println(
				courses.stream()
				       .filter(reviewScoreGreaterThan95Predicate)
				       .mapToInt(Course::getNoOfStudents)
				       .count()); // 3
		
		System.out.println(
				courses.stream()
				       .filter(reviewScoreGreaterThan95Predicate)
				       .mapToInt(Course::getNoOfStudents)
				       .max()); // OptionalInt[24000]
		
		
		// GROUPING COURSES INTO MAP USING GROUPING BY
		
		System.out.println(
				 courses.stream()
				 .collect(Collectors.groupingBy(Course::getCategory)));
		//  Output: {Cloud=[AWS:25000:93, Azure:23000:92, Docker:27000:91, 
		//  Kubernetes:28000:90], FullStack=[FullStack:12000:94], 
		//  Microservices=[API:22000:96, Microservices:21000:95], 
		//  Framework=[Spring:10000:98, Spring Boot:24000:97]}

		System.out.println(
				 courses.stream()
				        .collect(  Collectors.groupingBy(
						           Course::getCategory,
						           Collectors.counting()
						   )));
		// Output: {Cloud=4, FullStack=1, Microservices=2, Framework=2}

		
		System.out.println(
				 courses.stream()
				        .collect(  Collectors.groupingBy(
						           Course::getCategory,
						           Collectors.maxBy(Comparator.comparing(Course::getReviewScore))
						   )));
		
		// Output: { Cloud=Optional[AWS:25000:93], 
	    //           FullStack=Optional[FullStack:12000:94], 
		//           Microservices=Optional[API:22000:96], 
		//           Framework=Optional[Spring:10000:98]}

		
		System.out.println( 
				   courses.stream()
				   .collect(Collectors.groupingBy(Course::getCategory,
						    Collectors.mapping(Course::getName, Collectors.toList()))));
		// Output: {Cloud=[AWS, Azure, Docker, Kubernetes], FullStack=[FullStack], Microservices=[API, Microservices], Framework=[Spring, Spring Boot]}

		
		
		
	}

}
