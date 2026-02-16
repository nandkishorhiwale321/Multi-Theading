package multi_threading;

public class sync {

	public static void main(String[] args) throws InterruptedException {
		
		
		Fun one = new Fun();
		
		
		Two two =new Two();
		Three th =new Three();
		
		two.one=one;
		th.one=one;
		
		two.start();
		th.start();
		
		Thread.sleep(2000);
		
		System.out.println(one.getInc());
		
		
		
		
	}

}
class Fun {
	
	int count=0;
	
	public  void Incr() {
		this.count++;
	}
	
	public int getInc() {
		return this.count;
	}
}
class Two extends Thread 
{
	Fun one;
	
	public void run() {
		
		for(int i=0;i<1000;i++) {
			one.Incr();
		}
	}
}
class Three extends Thread
{
      Fun one;
	public void run() {
		for(int i=0; i<1000;i++) {
			one.Incr();
		}
	}
}
