package A06_Playing_With_Java_Functional_Programming;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A28_Creating_Streams_Using_Stream_Of_Method_And_For_Arrays {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of( 1, 2, 3, 4, 5, 6, 7, 8, 9 );
		System.out.println( numbers.stream() ); // java.util.stream.ReferencePipeline$Head@41a4555e
		
		// count
		int count =  (int) Stream.of(1,2,3,4,5).count();
		
		System.out.println( count ); // 5
		
		// sum
		int sum = Stream.of(1, 2, 3, 4, 5).reduce(0, Integer::sum);
		
		System.out.println(sum); // 15
		
		// 
		int[] numberArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int sum1 = Arrays.stream(numberArr).sum();
		
		System.out.println(sum1); // 45
		
        OptionalDouble avg = Arrays.stream(numberArr).average();
		
		System.out.println(avg); // OptionalDouble[5.0]
		
        OptionalInt min = Arrays.stream(numberArr).min();
		
		System.out.println(min);  // OptionalInt[1]
		
        OptionalInt max = Arrays.stream(numberArr).max();
		
		System.out.println(max); // OptionalInt[9]
		
		// this sum will include sum of elements from 1 to 9
		int sum2 = IntStream.range(1, 10).sum(); 
		System.out.println(sum2); // 45
		
		// this sum will include sum of elements from 1 to 10
		int sum3 = IntStream.rangeClosed(1, 10).sum();
		System.out.println(sum3); // 55
		
		// Sometimes we don't want a sequential set of values, may be we want a some kind of an algorithm to generate this values.
		// So, here is a way to do that
		
		// we are starting from 1 and adding 2 in each element that means we are getting odd number series 
		// IntStream.iterate(1, e -> e + 2) <--- this loop is infinite so we need to add limit to stop this loop
		int sum4 = IntStream.iterate(1, e -> e + 2).limit(10).sum();
		
		// peek() function will allow us to looking to the stream without making any changes to the actual stream
		IntStream.iterate(1, e -> e + 2).limit(10).peek(System.out::println).sum();
/*
Odd Numbers:
1
3
5
7
9
11
13
15
17
19

sum = 100
*/ 	
		System.out.println("Sum of odd numbers: " + sum4); // 100
		
		// Series of even numbers
		IntStream.iterate(2, e -> e + 2).limit(10).peek(System.out::println).sum();
		int sum5 = IntStream.iterate(2, e -> e + 2).limit(10).sum();
		System.out.println("Sum of even numbers: " + sum5);
		
		
		// Doubling 2
		IntStream.iterate(2, e -> e * 2).limit(10).peek(System.out::println).sum();
		int sum6 = IntStream.iterate(2, e -> e * 2).limit(10).sum();
		System.out.println("Sum of square of numbers: " + sum6);
		
		// We can't directly apply collect on a primitive stream
//		IntStream.iterate(2, e -> e * 2).limit(10).collect(Collectors.toList());
		
		// before applying collect on a primitive stream we need to do something 
		// we need to apply boxed() method
		// first, we need to do boxed() then then apply collect()
		
		
		System.out.println( IntStream.iterate(2, e -> e * 2).limit(10).boxed().collect(Collectors.toList())  );
		// [2, 4, 8, 16, 32, 64, 128, 256, 512, 1024]

		
	}

}
