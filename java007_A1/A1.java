package java007_A1;

import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String target = sc.next();
		int result = process(text, target);
		printResult(result);
		
	}
	
	static int process(String text, String target) {
		String[] textArr = text.split("");
		int result = 0;
		for (int i = 0; i < text.length(); i++) {
			if (textArr[i].equals(target) == true) {
				result = i + 1;
				break;
			}
		}
		return result;
	}
	
	static void printResult(int result) {
		System.out.println(result);
	}
}