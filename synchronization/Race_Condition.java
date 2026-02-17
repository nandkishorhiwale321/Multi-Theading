package synchronization;

public class Race_Condition {
	public static void main(String [] args) throws InterruptedException {
		Lab la= new Lab();
		
		lab_a  a= new lab_a();
		
		lab_b b = new lab_b();
		
		a.la=la;
		b.la=la;
		
		Thread.sleep(2000);
		
		a.start();
		b.start();
		
		a.join();
		b.join();
		
		
		System.out.println(la.res());
		
	}

}
class Lab {
	
	int count=0;
	
	public void adding() {
		
		count++;
		
	}
	
	public  void removing() {
		count--;
	}
	
	public int res() {
		return count;
	}
}
class lab_a extends Thread {
	Lab la;
	public void run() {
		for(int i=0;i<1000;i++) {
			la.adding();
			
		}
	}
}
class lab_b extends Thread {
	Lab la;
	public void run() {
		for(int i=0;i<1000;i++) {
		la.removing();
	}
	}
}
