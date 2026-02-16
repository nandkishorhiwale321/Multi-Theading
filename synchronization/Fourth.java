package synchronization;

public class Fourth {

	public static void main(String[] args) throws InterruptedException {
		
		Demo demo =new Demo();
		Demo demo2 = new Demo();
		
		Cl1 cl=new Cl1();
		Cl2 cl2=new Cl2();
		
		cl.demo=demo;
		cl.demo=demo2;
		
		cl.start();
		
		
		Thread.sleep(1000);
		System.out.println("demo"+demo.getres());
		System.out.println(demo2.getres());
		
	}

}
class Demo 
{
	int count =0;
	int count2 =0;
	
	
	public void m() {
		synchronized(this) {
		this.count--;
		}
		
		this.count2++;
		
	}
	
	public int  getres() {
		return this.count;
		
	}
}
class Cl1 extends Thread
{
	Demo demo;
	
	public void run() {
		for(int i=0;i<1000;i++) {
			demo.m();
		}
	}
}
class Cl2 extends Thread
{
	Demo demo;
	
	public void run() {
		for(int i=0;i<1000;i++) {
			demo.m();
		}
	}
}