package A07_Playing_Further_With_Java_Functional_Programming;

import java.util.stream.LongStream;

public class A33_Improving_Performance_With_Parallelization_Of_Stream {

	public static void main(String[] args) {
		
		// Get to know about time
		long time = System.currentTimeMillis();
		
		// 0, 1000000000
		// sum
		// System.out.println( LongStream.range(0, 1000000000).sum() ); // 499999999500000000  -> Before parallel() -> Time: 1835
		
		System.out.println( LongStream.range(0, 1000000000).parallel().sum() ); // 499999999500000000 -> After parallel() -> Time: 120  -> Improvement: 25%                                     
		
		System.out.println( System.currentTimeMillis() - time );
		
		// Why is it easy to parallelize the functional code ?
		// Why can't we parallelize the structured code ?
		// Becoz in structured code there are lots of states(changing of values of variable continuously) in structured code
		
		// parallel() method will splits this stream() in multiple parts executes this operations on multiple parts and finally combine the results on multiple parts 
		// it runs the part1 on one core and part2 on another core and finally merge the results
		
		
		
		
		
		
		
	}

}
