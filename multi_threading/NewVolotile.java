package multi_threading;

public class NewVolotile {
	public class VolatileKayword {
		
		static boolean flag= true;
		
		public static void main(String args) {
			
			Thread t1=new Thread(()->{
				System.out.println("Thread one is started");
				while(flag==true) {
					
				}
				System.out.println("thread one is ended");
				
			});
			
			Thread t2= new Thread(()->{
				System.out.println("flag is set to be a false");
				flag=false;
			});
			
			t1.start();
			t2.start();
			
			
		}

	}


}
