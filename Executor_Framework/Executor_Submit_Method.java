package Executor_Framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor_Submit_Method {
	public static void main (String [] args) {
		
		
		ExecutorService es =  Executors.newFixedThreadPool(1);
		
		Runnable run = ()->{
			System.out.println("Azim ");
		};
		
		Runnable run2 = ()->{
			System.out.println("Omkar ");
		};
		
		Runnable run3 = ()->{
			System.out.println("Aniket ");
		};
		
		es.submit(run3);
		es.submit(run2);
		es.submit(run);
		
		es.shutdown();
		
	}

}
