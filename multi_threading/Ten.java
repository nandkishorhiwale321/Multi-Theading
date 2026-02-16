package multi_threading;

public class Ten {

	public static void main(String[] args) {
            
		Car c= new Car();
		Thread t4 = new Thread (c);
		
		t4.start();
		  
		
	}

} class Car implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("heloo");
		}
	}
	
}
