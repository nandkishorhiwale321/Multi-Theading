package synchronization;

public class One {
	public static void main (String [] args) throws InterruptedException {
		
		Counter cong = new Counter();
		
		One_T one = new One_T();
		Two_T two = new Two_T();
		
		one.cong=cong;
		two.cong=cong;
		
		one.start();
		two.start();
		
		
		Thread.sleep(2000);
		System.out.println(cong.GetIncr());
		
		
		
		
	}

}
class Counter 
{
	int count=0;
	
	public void Increass() {
		this.count++;
	}
	
	public int GetIncr() {
		return this.count;
	}
}
class One_T extends Thread 
{
	Counter cong;
	
	public void run () {
		for(int i=0;i<1000;i++) {
			cong.Increass();
		}
	}
}
class Two_T extends Thread
{
	Counter cong;
	
	public void run() {
		for(int i=0;i<1000;i++) {
			cong.Increass();
		}
	}
}
