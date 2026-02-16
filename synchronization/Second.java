package synchronization;

public class Second {

	public static void main(String[] args) throws Exception{
		
		PrintTable pt =new PrintTable();
		
		printting pm=new printting();
		printting2 pm2=new printting2();

		
		
		pm.pt=pt;
		pm2.pt=pt;
		
		pm.start();
		pm2.start();
		
		Thread.sleep(1000);
		
	}

}
class PrintTable
{
	int n;
	
	public void pnt(int n) {
		for(int i=1; i<=10;i++) {
			System.out.println(n*i);
		}
	}
}
class printting extends Thread {
	
	PrintTable pt;
	
	
	public void run () {
		System.out.println(Thread.currentThread().getName()
				);
		pt.pnt(5);
		
}
}
class printting2 extends Thread {
	
	PrintTable pt;
	
	public void run () {
		try {
		Thread.sleep(1000);
		}
		catch(Exception e) {
			
		}
		pt.pnt(10);
	}
}
