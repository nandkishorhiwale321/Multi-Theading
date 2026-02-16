package multi_threading;

public class nine {

	public static void main(String[] args) {
		  
		Thread t1 =new Thread(()->{
			for(int i=0;i<40;i++) {
		System.out.println("heloo");
			}
		});
		t1.start();
		
		Thread t3 = new Thread(()->{
			for(int s=0;s<10;s++) {
				System.out.println("Keep blessing good");
				
				
			}
		});
		t3.start();
	}     

}
