package java007_A1;

import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = { 123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29 };
		String target = sc.next();
		process(numbers, target);
	}

	static void process(int[] numbers, String target) {
		String[] numArr = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			numArr[i] = Integer.toString(numbers[i]);
		}

		int result = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numArr[i].contains(target) == true) {
				System.out.print(numbers[i] + " ");
			}
		}
	}
}
