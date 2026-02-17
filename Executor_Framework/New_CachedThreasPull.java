package Executor_Framework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class New_CachedThreasPull {
	public static void main (String [] args) throws Exception {
		
	Runnable run = ()->{System.out.println("Arun "+Thread.currentThread().getName());};
	
	ExecutorService es = Executors.newSingleThreadExecutor();
	
	   es.execute(()->{
		   for(int i=0;i<10;i++) {
			   run.run();
		   }
	   });
	  
	   
	   Callable<String> cl= ()->{return "abcd";};
	   
	  System.out.println( cl.call());
	   
	   
	   
	  es.shutdown();
	   
	  // Future<String> ft =cl.call();
	   
	}
}