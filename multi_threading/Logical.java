package multi_threading;

public class Logical {
	public static void main (String [] args) {
		
		Thread t1 = new Thread(()->{
			String str="NANDA";
			
			char[] ch =str.toCharArray();
			
			for(char c:ch) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
			
					e.printStackTrace();
				}
				System.out.print(c);
			}
		});
		
		t1.start();
	}
	
	

}
