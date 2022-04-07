package java010;

public class Main6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new MultiThreadTestB("[ Thread " + 1 + " ]");
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		Thread thread2 = new MultiThreadTestB("[ Thread " + 2 + " ]");
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.start();
	}
}

class MultiThreadTestB extends Thread {
	public MultiThreadTestB (String ThreadName) {
		this.setName(ThreadName);
	}
	
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getName() + " Thread_Start ");
	}
}
