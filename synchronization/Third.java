package synchronization;

public class Third {

	public static void main(String [] args) throws InterruptedException {
		/*
		 * method level synchronization
		 * object level synchronization
		 */
		
		calcu cl= new calcu();
		calcu cl2= new calcu();
		
		Add ad= new  Add();
		Sub sb= new Sub();
		
		
		ad.cl=cl;
		sb.cl=cl2;
		
		ad.start();
		sb.start();
		
	
		
		Thread.sleep(1000);
		
		System.out.println(cl.getcount());
		System.out.println(cl2.getcount());
		
	}
}
class calcu {
	
	int counter =0;
	
	public  synchronized void add() {
		this.counter++;
		
	}
	
	public  synchronized  void sub() {
		this.counter--;
		
	}
	
	public int getcount() {
		return this.counter;
	}
}

class Add extends Thread {
	
	calcu cl;
	
	public  void run() {
		
		for(int i=0; i<10000;i++) {
			cl.add();
		}
	}
}
class Sub extends Thread {
	calcu cl;
	
	public void run() {
		for(int i=0;i<100;i++) {
			cl.sub();
		}
	}
	
}