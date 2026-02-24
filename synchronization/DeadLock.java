package synchronization;

public class DeadLock {
	
	public static void main (String [] args) {
		
		
		Object one = new Object();
		Object two = new Object();
		
		Thread t = new Thread(()->{
			synchronized(one) {
				
			System.out.println("Thread one is locked nanda");
				
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			synchronized(two) {
				System.out.println("thread one is locked patil");
			}
		});
		
		
		Thread t2 = new Thread(()->{
			synchronized(two) {
				System.out.println("therad two is locked nanda");
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			synchronized(one) {
				System.out.println("threadb two is locked patil");
			}
		});
		
		t.start();
		t2.start();
	}

}
