package Executor_Framework;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


public class New_fixedThreadpull {
	public static void main(String [] args) {
		
		
		Runnable r1= ()->{
			for(int i=0; i<10;i++) {
				System.out.println(i  +" "+Thread.currentThread().getName());
			}
		};
		
		Runnable r2= ()->{
			System.out.println("*   -  "+Thread.currentThread().getName());
		};
		
		Runnable r3 = ()->{
			System.out.println("Hey  -  "+Thread.currentThread().getName());
		};
		
		Executor ex = Executors.newFixedThreadPool(2);
		
		ex.execute(r3);
		ex.execute(r2);
		ex.execute(r1);
		
		
		
	}

}
