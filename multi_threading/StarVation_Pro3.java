package multi_threading;

public class StarVation_Pro3 {
	public static void main (String [] args) {
		
		Thread high= new Thread(()->{
			while(true) {
				System.out.println("High priority is running........*");
			}
		});
		
	   Thread low  =new Thread (()->{
		   while(true) {
			   System.out.println("Low priority is running..........!");
		   }
	   });
	   high.setPriority(10);
	   low.setPriority(1);
	   high.start();
	   low.start();
	}

}
