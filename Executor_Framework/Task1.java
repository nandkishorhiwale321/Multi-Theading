package Executor_Framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task1 {
	public static void main (String [] args) {
		
		ExecutorService es = Executors.newFixedThreadPool(1);
		for(int i=0; i<10;i++) {
			int tasknumber=i;
		
		 es.submit(()->{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("taskNumber "+tasknumber+Thread.currentThread().getName());
		});
		
	}

es.shutdown();
}
}