package plus;

import java.util.Scanner;

public class timeLag {
	static Scanner sc = new Scanner(System.in);
	static String firstTime = "";
	static String secondTime = "";

	public static void main() {
		firstTime = sc.nextLine();
		secondTime = sc.nextLine();
		printResult();
	}

	public static void printResult() {
		int firstInt = Integer.parseInt(firstTime);
		int secondInt = Integer.parseInt(secondTime);
		String[] firstArr = firstTime.split(" ");
		String[] secondArr = secondTime.split(" ");
		String resultTime = "";
		
		System.out.println(firstInt);
		
		for (int i = 0; i < 3; i++) {
			if (firstArr[i] > secondArr[i]) {
				resultArr[i] = secondArr[i] - firstArr[i] + 60;
				secondArr[i + 1]--;
			} else if (firstArr[i] <= secondArr[i]) {
				resultArr[i] = secondArr[i] - firstArr[i];
			}
		}
		
	}
}
