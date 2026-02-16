package multi_threading;

public class eigth {
                      
	
	public static void main(String[] args) {

		  demo1 d =new demo1();
		  demo1 d1 = new demo1();;
		  d.start();
		  d1.start();
		  
		  int count=0;
		  while(count<50){
			  System.out.println("hello");
			  count++;
			  
		  }
		
	}

}class  demo1 extends Thread{
	
	public void run() {
		for(int i=1;i<60;i++) {
			try {
				
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
			
			System.out.println(i);
		}
	}
	
}
