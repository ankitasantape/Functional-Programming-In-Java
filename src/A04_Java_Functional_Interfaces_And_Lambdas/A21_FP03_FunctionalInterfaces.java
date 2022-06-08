package A04_Java_Functional_Interfaces_And_Lambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class A21_FP03_FunctionalInterfaces {

	/*
	    boolean isEven(int x){
	       return x%2 == 0;
	    }
	    
	    int squared(int x){
	       return x * x;
	    }      
	 
	 
	 */
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
//		numbers.stream()
//		    .filter(x -> x%2 == 0)
//		    .map(x -> x * x)
//		    .forEach(System.out::println);
		
		// How does this filter(), map() method works in the background ?
		
		Predicate<Integer> isEvenPredicate = x -> x%2 == 0;
		
		// The things which are happening in the background of Predicate class
		Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer x) {
				return x%2 == 0;
			}
		};
		
		Function<Integer, Integer> squareFunction = x -> x*x;
		
		// The things which are happening in the background of Function class
		Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>(){
			@Override
			public Integer apply(Integer x) {
				return x*x;
			}
		};
		
		Consumer<Integer> sysoutConsumer = System.out::println;
		
		// The things which are happening in the background of Consumer class
		// It consumes whatever it gets
		Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {
			@Override
			public void accept(Integer x) {
				System.out.println(x);
			}
		};
		
		numbers.stream()
	       .filter(isEvenPredicate)
	       .map(squareFunction)
	       .forEach(sysoutConsumer);
		
		System.out.println("------------------------------");
		numbers.stream()
	       .filter(isEvenPredicate2) // with a filter we're defining a condition, so we'll take a input and return back whether it's a boolean and there we use a predicate
	       .map(squareFunction2) // map actually takes a input and customizes it and returns an output. We have 1 input & 1 output and that's where we use a function.
	       .forEach(sysoutConsumer2); // forEach() is a consumer, it takes the input and it consumes it. Either it prints it to the console, it might it send it to the utility or it might save it to the database. It just consumes it and it doesn't returns it anything back.
		                              // In those kind of situations we use a consumer 
		
	}

}

