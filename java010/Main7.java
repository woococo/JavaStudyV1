package java010;

public class Main7 implements Runnable {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Main7 main = new Main7();
		Thread thread = new Thread(main);
		thread.start();
	}
	
	@Override
	public void run() {
		System.out.println("Thread");
	}
}
