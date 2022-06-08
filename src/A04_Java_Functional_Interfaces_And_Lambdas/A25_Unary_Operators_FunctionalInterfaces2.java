package A04_Java_Functional_Interfaces_And_Lambdas;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class A25_Unary_Operators_FunctionalInterfaces2 {

	public static void main(String[] args) {
		 List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		 
		 Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;
		 
		 Function<Integer, Integer> squareFunction = x -> x * x;
		 
		 Function<Integer, String> stringOutputFunction = x -> x + " ";
		 
		 Consumer<Integer> sysoutConsumer = x -> System.out.println(x);
		 
		 BinaryOperator<Integer> sumBinaryOperator = (x, y) -> x + y;
		 
		 //Supplier
//		 Supplier<Integer> randomIntegerSupplier = () -> 2;
		 
		 // No input > Return Something back
		 Supplier<Integer> randomIntegerSupplier = () -> {
			 Random random = new Random();
			 random.nextInt(1000);
			 return 2;
		 };
		 
		 System.out.println( randomIntegerSupplier.get() );
		  
		 UnaryOperator<Integer> unaryOperator = (x) -> 3 * x;
		 System.out.println(unaryOperator.apply(10));
		 
		 // With BiPredicate -> it will return boolean value back
		 BiPredicate<Integer, String> biPredicate = (number, str) -> {
			  return number<10 && str.length()>5;
		 };
		 
		 System.out.println( biPredicate.test(15, "happycoding") );
		 
		 // With BiFunction -> it takes two input and it returns one one output back
		 BiFunction<Integer, String, String> biFunction = (number, str) -> {
			  return number + " " + str;
		 };
		 
		 System.out.println( biFunction.apply(15, "happycoding") );
		 
		 
		 // With BiConsumer -> It doesn't return anything back
		 BiConsumer<Integer, String> biConsumer = (s1, s2) -> {
			System.out.println(s1);
			System.out.println(s2);
		 };
		 
		 biConsumer.accept(15, "happyCoding");
		 
		 // BinaryOperator<Integer> sumBinaryOperator2 = (x, y) -> x + y;
		 
		 // It is mandatory once you put data type to one parameter then you need to put parameter to another parameter as well.
		 BinaryOperator<Integer> sumBinaryOperator2 = (Integer x, Integer y) -> x + y;
		 
		 IntBinaryOperator intBinaryOperator = (x,y) -> x + y;
		 
		 /*
		    Consumer<String> consumer = () -> {}
		    => Will this expression work ?
		    => No. Why? Becoz the Consumer expects only one parameter
		 
		    Consumer<String> consumer = (str) -> {}
		    => Will this expression compile ?
		    => $Lambda$51/1033490990@49fc609f
		    => Yes. It's compiled successfully. 
		    => Why ? Becoz we are taking this and we are doing nothing. Open brace, close brace it's not really doing anything
		    
		    Consumer<String> consumer = System.out::println 
		    
		    Consumer<String> consumer = (str) -> System.out.println(str);
		    
		    BiConsumer<String, String> consumer = (str, str2) -> System.out.println(str);
		    
		    Supplier<String> supplier = () -> { return "Ranga"; }
		    
		    Consumer<String> consumer = (str) -> { System.out.println(); System.out.println(str); }
		    
		    
		 */
		 
		 
		 
		 //IntConsumer
		 //IntFunction
		 //IntPredicate
		 //IntSupplier
		 //IntToDoubleFunction
		 //IntToLongFunction
		 //IntUnaryOperator
		 
		 //Boolean, Long, Double, Float
		 
		 numbers.stream()
		    .filter(isEvenPredicate)
		    .map(squareFunction)
		    .forEach(sysoutConsumer);
		 
		 int sum = numbers.stream()
				       .reduce(0, sumBinaryOperator);
		 
		 
	}

}
