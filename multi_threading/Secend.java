package multi_threading;

public class Secend {

	public static void main(String[] args) {
		
		Demo d =new Demo();
		
		d.start();
		
		int count=0;
		while(count<10) {
			System.out.println("hello");
			count ++;
		}
		
	}

}
class Demo extends Thread
{
	public void run() {
		
		for(int i=1;i<15;i++) {
		System.out.println(i);
		}
		}
}
