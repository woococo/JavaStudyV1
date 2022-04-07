package java010;

public class Main5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new MultiThreadTestA("[ Thread " + 1 + " ]");
		thread1.start();
		Thread thread2 = new MultiThreadTestA("[ Thread " + 2 + " ]");
		thread2.start();
	}
}

class MultiThreadTestA extends Thread {
	public MultiThreadTestA (String ThreadName) {
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
