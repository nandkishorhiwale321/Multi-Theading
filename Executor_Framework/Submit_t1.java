package Executor_Framework;

import java.util.concurrent.ExecutionException;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Submit_t1 {
	public static void main (String [] args) throws InterruptedException, ExecutionException{
		
		
		ExecutorService es = Executors.newSingleThreadExecutor();	
		
		Future<String> ft =es.submit(()->{
			return "Hello";
		});
		
		
		Future <Integer>ft2 = es.submit(()->{
			return 101;
		});
		
		Future <Double> ft3 = es.submit(()->{
			return 101.12;
		});
		
		Future <Character>ft4=es.submit(()->{
			return 'A';
		});
		
		Future <String> ft5= es.submit(()->{
			return "Bye";
		});
		System.out.println(ft.get()+Thread.currentThread().getName());
		System.out.println(ft2.get()+Thread.currentThread().getName());
		System.out.println(ft3.get()+Thread.currentThread().getName());
		System.out.println(ft4.get()+Thread.currentThread().getName());
		System.out.println(ft5.get()+Thread.currentThread().getName());
		
		es.shutdown();
		
	}

}
