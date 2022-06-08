package A07_Playing_Further_With_Java_Functional_Programming;

import java.util.List;
import java.util.function.Predicate;

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
public class A31_Higher_Order_Function {

	public static void main(String[] args) {
		
		// Higher Order Function: Higher order function is a function which returns a function 
		
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
		Predicate< Course > reviewScoreGreaterThan95Predicate = createPredicateWithCutoffReviewScore(95);
		
		Predicate< Course > reviewScoreGreaterThan90Predicate = createPredicateWithCutoffReviewScore(90);
		
		Predicate< Course > reviewScoreLessThan90Predicate = createPredicateWithCutoffReviewScore(80);
		
		System.out.println( reviewScoreGreaterThan95Predicate );
		System.out.println( reviewScoreGreaterThan90Predicate );
		System.out.println( reviewScoreLessThan90Predicate );
	}

	private static Predicate<Course> createPredicateWithCutoffReviewScore(int cutOffReviewScore) {
		return course -> course.getReviewScore() > cutOffReviewScore;
	}

}
