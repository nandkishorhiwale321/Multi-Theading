package Executor_Framework;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Executor_01 {
	public static void main (String [] args) {
		
		Runnable r1= (()->{
			for(int i=0;i<10;i++) {
				System.out.println("Ram");
			}
		});
		
		Runnable r2 = (()->{
			int count=0;
			while(count<10) {
				System.out.println("Shyam");
				count++;
			}
		});
		
		Runnable r3 =(()->{
			int count =1;
			while(count<10) {
				System.out.println("Narayan");
				count++;
			}
		});
		
		Executor ex= Executors.newFixedThreadPool(1);
		
		ex.execute(r3);
		ex.execute(r2);
		ex.execute(r1);
		
		
	}

}
