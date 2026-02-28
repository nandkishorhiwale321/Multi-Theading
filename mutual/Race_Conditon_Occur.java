package mutual;

public class Race_Conditon_Occur {
	public static void main(String[] args) throws InterruptedException {

		extcute_thredad task = new extcute_thredad();

		First_1 task_1 = new First_1();
		Second_1 task_2 = new Second_1();

		task_1.count = task;
		task_2.count = task;

		task_1.start();
		task_2.start();
		
		task_1.join();
		task_2.join();

		System.out.println(task.getcount());
	}

}

class extcute_thredad {
	int count = 0;

	public synchronized void incress() {
		count++;
	}

	public synchronized void decree() {
		count--;
	}

	public int getcount() {
		return count;
	}
}

class First_1 extends Thread {
	extcute_thredad count;

	public void run() {

		for (int i = 0; i < 1000; i++) {
			count.incress();
		}
	}
}

class Second_1 extends Thread {
	extcute_thredad count;

	public void run() {

		for (int i = 0; i < 1000; i++) {
			count.decree();
		}
	}
}