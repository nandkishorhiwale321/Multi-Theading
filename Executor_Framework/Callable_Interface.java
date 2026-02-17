package Executor_Framework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable_Interface {
	public static void main (String [] args) throws InterruptedException, ExecutionException {
		
		ExecutorService es = Executors.newSingleThreadExecutor();
		Future <String> ft =es.submit(()->{
			return new String  ("abcd");
		});
		
		System.out.println(ft.get());
		
		
		es.shutdown();
	}

}
