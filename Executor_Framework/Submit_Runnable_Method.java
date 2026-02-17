package Executor_Framework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Submit_Runnable_Method {
	public static void main (String [] args) throws InterruptedException, ExecutionException {
		
		Runnable run = ()->{
			System.out.println("Amar");
			
		};
		
		ExecutorService es = Executors.newSingleThreadExecutor();
		
		Future<?> ft=es.submit(run,"Default value");
		
		System.out.println(ft.get());
		
		
		es.shutdown();
		
	}

}
