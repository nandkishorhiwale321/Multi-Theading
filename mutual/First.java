package mutual;

import java.util.ArrayList;
import java.util.List;

public class First {
	public static void main(String [] args) throws InterruptedException {
		
		SheredResouce shr = new SheredResouce();
		Adder ad= new Adder();
		Removal rm = new Removal();
		
		ad.sr=shr;
		rm.sr=shr;
		
		rm.start();
		ad.start();
		
	
		
		
	}

}
class SheredResouce{
	
	List<Integer> list= new ArrayList<>();
	int num = 1;
	
	
	public synchronized void adding() throws InterruptedException {
		Thread.sleep(1000);
		if(list.size()==10) {
			
			System.out.println("memory full............");
			wait();
			System.out.println("waiting for  removal");
		}
		
	    
		list.add(num);
		notify();
		System.out.println("Added :"+num);
		num++;
	}
	
	public synchronized void removing() throws Exception{
		
		if(list.size()==0) {
		
			System.out.println("no element for removing");
			wait();
			
		}
		
	int rem =	list.remove(0);
	              notify();
		
		
		
	}
}
class Adder extends Thread
{
	SheredResouce sr;
	
	public void run() {
		while(true) {
		try {
			
			
			sr.adding();
			System.out.println("increment");
			
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
}
}
class Removal extends Thread {
	
	SheredResouce sr;
	
	public void run() {
		while(true) {
		
		try {
			Thread.sleep(5000);
		
			sr.removing();
			System.out.println("decrement");
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
}
