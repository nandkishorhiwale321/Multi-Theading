package Executor_Framework;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Executor_02 {
	public static void main(String [] args) {
		
		Runnable run1 =(()->{
			
				System.out.println("Runnable one is it....1"+Thread.currentThread().getName());
		
			
		});
		
		Runnable run2=(()->{
			System.out.println("Runnable two is it....2"+Thread.currentThread().getName());
		});		
		
		Runnable run3 =(()->{
			System.out.println("Runnable Three is it....3"+Thread.currentThread().getName());
		});
		
		Runnable run4 =(()->{
			System.out.println("Runnable Four is it....4"+Thread.currentThread().getName());
		});
		
		Executor e = Executors.newFixedThreadPool(2);
		
		e.execute(run4);
		e.execute(run3);
		e.execute(run2);
		e.execute(run1);
		
	}

}
