package java004_A1;

import java.util.Arrays;
import java.util.Scanner;

public class P3 { // Program to Calculate the Sum of Multiples of N
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int[] mul = new int[number1 / number2];
		int count = 0;
		int sum = 0;

		for (int i = 1; i <= number1; i++) {
			if (i % number2 == 0) {
				mul[count] = i;
				sum += mul[count];
				count++;
			}
		}
		System.out.println("SUM : " + sum + Arrays.toString(mul));
	}

}

// end
