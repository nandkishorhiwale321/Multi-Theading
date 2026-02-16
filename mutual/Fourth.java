package mutual;

public class Fourth {
	//boolean flag= true;
	public static void main (String [] args) throws Exception {
		
		boolean flag = true;
		
	   Test ts = new Test();
	   
	   Op op= new Op();
	   
	   op.ts=ts;
	   
	   op.start();
	   

	   
	      Thread.sleep(5000);
	      
	      
	      flag =false;
	      System.out.println("Second thread is exicute now");
	      
		
	}

}
class Test {
	
	int count =0;
	
	public void increse() {
		this.count++;
	}
	
	public int getRes() {
		return this.count;
	}
}
class Op extends Thread {
	
	Test ts;
      

	public void run() {
		System.out.println("First Thread will exicute now");
		
	boolean flag = true;
	
		while(flag) {
			
			for(int i=0; i<100;i++) {
				
		
		ts.increse();
		
		}
	}
	}
	
}
