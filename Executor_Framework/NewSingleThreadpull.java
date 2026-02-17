package Executor_Framework;

import java.util.concurrent.Executors;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public class NewSingleThreadpull {
	public static void main (String [] args) throws InterruptedException {
		try(ExecutorService es = Executors.newSingleThreadExecutor();){
		
		es.execute(()->{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("kunal - "+Thread.currentThread().getName());
		});
		
		es.execute(()->{
			try {
				Thread.sleep(1100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Yuvraj - "+Thread.currentThread().getName());
		});
		
		es.execute(()->{
			try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("karan - "+Thread.currentThread().getName());
		});
		 
		Thread.sleep(1000);
		es.shutdown();
	
	}

}}
