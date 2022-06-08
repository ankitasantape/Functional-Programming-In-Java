package A08_Functional_Programming_Makes_Java_Easy;

import java.util.stream.IntStream;

public class A36_Threads {

	public static void main(String[] args) {
		 
//		 Runnable runnable = new Runnable() {
//			@Override
//			public void run() {
//				for(int i = 0; i < 10000; i++) {
//					System.out.println(Thread.currentThread().getId() + ":" + i );
//				}
//			} 
//		 };
		 
		 Runnable runnable1 = new Runnable() {
				@Override
				public void run() {
					for(int i = 0; i < 10000; i++) {
						System.out.println(Thread.currentThread().getId() + ":" + i );
					}
				} 
		 };
		 
		 Runnable runnable2 = () ->
					IntStream.range(0, 10000).forEach (
						i -> System.out.println(Thread.currentThread().getId() + ":" + i )
					);
				
		 
		 
		 Thread thread = new Thread(runnable1);
		 thread.start();
		 
		 Thread thread1 = new Thread(runnable1);
		 thread.start();
		 
		 Thread thread2 = new Thread(runnable1);
		 thread.start();
		 
		 
		 
		 
		 
	}

}
