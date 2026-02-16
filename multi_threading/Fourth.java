package multi_threading;

public class Fourth {
	public static void main (String [] args) throws InterruptedException {
		
		Animal an=new Animal(10);
		
		Thread t1 =new Thread (an);
		t1.start();
		
		int count =1;
		while(count <10) {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(1000);
			System.out.println("yuviii");
			count++;
		}
	
	}
}
class Animal implements Runnable {
	
	public Animal (int a) {
		
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
			Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
			System.out.println(i);
		}
		
	}

		
	}

