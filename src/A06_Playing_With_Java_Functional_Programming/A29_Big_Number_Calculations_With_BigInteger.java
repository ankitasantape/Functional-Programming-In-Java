package A06_Playing_With_Java_Functional_Programming;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class A29_Big_Number_Calculations_With_BigInteger {

	public static void main(String[] args) {
		
		System.out.println( Integer.MAX_VALUE ); // 2147483647
		
		System.out.println( Long.MAX_VALUE ); // 9223372036854775807
		
		// Want to print factorial of a number ?
		System.out.println(
		    IntStream.rangeClosed(1, 50).reduce(1, (x,y) -> x*y)); 
		// Output: 0
		
		System.out.println(
			    LongStream.rangeClosed(1, 50).reduce(1, (x,y) -> x*y));
		// Output: -3258495067890909184
 
		System.out.println(
			    LongStream.rangeClosed(1, 50).reduce(1L, (x,y) -> x*y));
		// Output: -3258495067890909184
		
		System.out.println(
			    LongStream.rangeClosed(1, 5).reduce(1L, (x,y) -> x*y));
		// Output: 120
		
		System.out.println(
			    LongStream.rangeClosed(1, 10).reduce(1L, (x,y) -> x*y));
		// Output: 3628800
		
		System.out.println(
			    LongStream.rangeClosed(1, 20).reduce(1L, (x,y) -> x*y));
		// Output: 2432902008176640000
		
		System.out.println(
			    LongStream.rangeClosed(1, 40).reduce(1L, (x,y) -> x*y));
		// Output: -70609262346240000
		
		
		// How to create BigInteger value ?
		// You need to map to an integer to object
		// To convert an integer to BigInteger we need to map an integer to object
		System.out.println(
		LongStream.rangeClosed(1, 50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply));                          ;
		// Output: 30414093201713378043612608166064768844377641568960512000000000000

		
		
		
	}

}
