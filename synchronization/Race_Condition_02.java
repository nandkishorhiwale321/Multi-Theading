package synchronization;

public class Race_Condition_02 {
public static void main (String [] args) throws InterruptedException {
	Fina fi = new Fina();
	
	
	A1 a =new A1();
	B1 b = new B1();
	
	a.fi=fi;
	b.fi=fi;
	
	a.start();
	b.start();
	//main ........
	
	a.join();
	b.join();
	
	System.out.println(fi.count);
	
	
	
}
}
class Fina {
	
	int count =0;
	
	public void add() {
		count++;
	}
	
	public void sub() {
		count--;
	}
	
	public int result() {
		return count;
	}
}
class A1 extends Thread {
	Fina fi;
	public void run() {
		for(int i=0;i<=10;i++) {
			fi.add();
		}
	}
}

class B1 extends Thread {
	
	Fina fi;
	
	public void run() {
		for (int i=0;i<10;i++) {
			
			fi.sub();
			
		}
	}
}