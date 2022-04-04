package java007;

import java.util.Scanner;

public class P8 { // Encryption
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		printResult(text);
	}

	public static void printResult(String text) {
		char[] textArr = text.toCharArray();
		char[] resultArr = new char[text.length()];
		String[] resultArrStr = new String[resultArr.length];
		
		for (int i = 0; i < textArr.length; i++) {
			resultArr[i] = (char) (219 - textArr[i]);
		}
		
		for (int i = 0; i < resultArr.length; i++) {
			System.out.print(resultArr[i]);
		}
	}
}