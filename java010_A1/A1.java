package java010_A1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {
		printTime();
	}
	
	public static void printTime() {
		Scanner sc = new Scanner(System.in);
		LocalTime now = LocalTime.now();
		time(now);
		System.out.println("");
		int number;
		number = sc.nextInt();	
		try { 
			Thread.sleep(number*1000);
			System.out.print("time is over(");
			time(now);
			System.out.println(")");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
	
	public static String time(LocalTime now) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
		now = LocalTime.now();
		String time = now.format(format);
		System.out.print(time);
		return time;
	}
}
