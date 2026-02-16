package multi_threading;

public class StarVation_pro2 {
	public static void main (String [] args) {
		
		Thread t1= new Thread(()->{
			int count =1;
			while(count<10) {
				System.out.println("First Thread is  Start....!"+Thread.currentThread().getName());
				count++;
			}
		});
		
		Thread t2 = new Thread(()->{
			int count=0;
			while(count<10) {
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				System.out.println("Second Thread is Start....!"+Thread.currentThread().getName());
				count++;
			}
		});
		
		Thread t3 = new Thread (()->{
			int count=1;
			while(count<10) {
//				try {
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				System.out.println("third Thread is Start...!"+Thread.currentThread().getName());
				count++;
			}
		});
		
		t1.setPriority(1);
		t2.setPriority(5);
		t3.setPriority(10);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
