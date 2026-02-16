package mutual;

public class Sixth {

	public static void main(String[] args) throws Exception {
		
		Thread t1 = new Thread (()->{
			System.out.println("one-"+Thread.currentThread().getName());
		});
		
		Thread t2 = new Thread (()->{
			System.out.println("Second-"+Thread.currentThread().getName());
		});
		
		Thread t3 = new Thread (()->{
			System.out.println("Third-"+Thread.currentThread().getName());
		});
		
		t3.setPriority(5);
		t2.setPriority(10);
	    t1.setPriority(1);
		
		
		t1.start();
		t2.start();
		t3.start();
	}
	

}
