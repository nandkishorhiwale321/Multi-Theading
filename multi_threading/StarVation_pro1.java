package multi_threading;

public class StarVation_pro1 {
	public static void main (String [] args)  throws Exception{
		Thread t1 = new Thread(()->{
			System.out.println("First"+Thread.currentThread().getName());
		});
		
		
		Thread t2 = new Thread(()->{
			System.out.println("Second"+Thread.currentThread().getName());
		});
		
		
		Thread t3 = new Thread(()->{
			System.out.println("third"+Thread.currentThread().getName());
		});
		
		
		t1.setPriority(1);
		t2.setPriority(10);
		t3.setPriority(10);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
