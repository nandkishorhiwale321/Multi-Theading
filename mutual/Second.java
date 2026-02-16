package mutual;

import java.util.ArrayList;
import java.util.List;

public class Second {
	public static void main (String [] args) {
		Source sr = new Source();
		
		AAdder ad = new AAdder();
		Remover rm =new  Remover();
		
		ad.sou=sr;
		rm.sou=sr;
		
		ad.start();
		rm.start();
		
		
		
		
	}

}
class Source {
	
	List<Integer>list = new ArrayList<>();
	
	int num=0;
	
	public synchronized void add() throws InterruptedException {
	Thread.sleep(1000);
		if(list.size()==10) {
			System.out.println("Memory Fulled.......!");
			wait();
		}
		
		System.out.println("Insert Element"+num);
		list.add(num);
		num++;
		notify();
			
		
	}
	
	public synchronized void remove() throws InterruptedException {
		if(list.size()==0) {
			System.out.println("No element for removing...........!");
			wait();
		}
		else {
			System.out.println("Remove");
			list.remove(0);
			notify();
		}
	}
}
class AAdder extends Thread {
	Source sou;
	
	public void run() {
		
		while(true) {
		
			try {
				
				sou.add();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		}
	
	
	
}
class Remover extends Thread {
	Source sou;
	
	public void run() {
		while(true) {
			
			try {
				Thread.sleep(1000);
				sou.remove();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
