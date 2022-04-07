package java010;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main4 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main4 thread = new Main4();
		thread.start();
		System.out.println("Check 1 : " + getCurrentTime() + "-" + thread.isAlive());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Check 2 : " + getCurrentTime() + "-" + thread.isAlive());
	}
	
	public static String getCurrentTime() {
		SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		return dateAndTime;
	}
	
	public void run() {
		int cnt = 0;
		while (true){
			if (cnt == 5) {
				break;
			}
			try {
				System.out.println( getCurrentTime() + "-" + cnt);
				Thread.sleep(100);
				cnt++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
