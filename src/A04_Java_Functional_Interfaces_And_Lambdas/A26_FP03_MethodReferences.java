package A04_Java_Functional_Interfaces_And_Lambdas;

import java.util.List;
import java.util.function.Supplier;

public class A26_FP03_MethodReferences {

	
	private static void print(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		List<String> courses = List.of(
				"Spring", "Spring Boot", "API",
				"Microservices",
				"AWS", "PCF", "Azure", 
				"Docker", "Kubernetes");
		
		courses.stream()
		   .map(str -> str.toUpperCase())
		   //.forEach(str -> System.out.println(str));
		   .forEach(A26_FP03_MethodReferences::print);
		
		
		Supplier<String> supplier = String::new;
		
	}

}
