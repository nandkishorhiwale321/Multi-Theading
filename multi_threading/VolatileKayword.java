package multi_threading;

public class VolatileKayword {
	
	static boolean flag= true;
	
	public static void main(String args) {
		
		Thread t1=new Thread(()->
		{
			System.out.println("Thread one is started"+Thread.currentThread().getName());
			while(flag==true) {
				
			}
			System.out.println("Thread one is ended");
			
		});
		
		Thread t2= new Thread(()->{
			System.out.println("flag is set to be a false"+Thread.currentThread().getName());
			flag=false;
		});
		
		t1.start();
		t2.start();
		
		
	}

}
