package multi_threading;

public class Third {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1=new Thread(()->{
			for(int i=1; i<100;i++) {
				System.out.println(Thread.currentThread().getName());
				System.out.println("HELLO MAHESH SIR");
			}
		});
		
		t1.start();
		//t1.join();
		
		System.out.println(Thread.currentThread().getName());
		
		
		Thread t2 =new Thread(()->{
			for(int i=1; i<100; i++) {
				System.out.println(Thread.currentThread().getName());
				if(i%2==0) {
					System.out.println(i);
				}
			}
		});
		t2.start();
	}

}
