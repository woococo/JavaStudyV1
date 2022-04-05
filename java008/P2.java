package java008;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		String text = inputText();
		printResult(text);
	}

	public static String inputText() {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		return text;
	}

	public static void printResult(String text) {
		String resultText = "";
		String resultTextTwo = "";
		String[] textArr = text.split("");
		for (int i = 0; i < text.length(); i++) {
			if (text.length() % 2 == 0) { // 문장길이가 짝수일 때
				int point = text.length() / 2;
				resultText = textArr[point - 1];
				resultTextTwo = textArr[point];
			} else if (text.length() % 2 != 0) { // 문장길이가 홀수일 때
				int point = text.length() / 2;
				resultText = textArr[point];
			}
		}
		System.out.println(resultText + resultTextTwo);
	}
}
