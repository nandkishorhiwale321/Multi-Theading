package Executor_Framework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable_SumOfNum {
	public static void main (String [] args) throws InterruptedException, ExecutionException {
		
		Callable<Integer> cl= ()->{
			int sum=0;
			
			for(int i=0;i<=100;i++) {
				sum=sum+i;
			}
			return sum;
			};
		
		ExecutorService es = Executors.newSingleThreadExecutor();
		
		Future<Integer> ft = es.submit(cl);
		
		
		Integer res =ft.get();
		
		System.out.println(res);
		es.shutdown();
	}

}
