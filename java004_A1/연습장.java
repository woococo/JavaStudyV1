package java004_A1;

import java.util.Scanner;

public class ������ {
	public static void main(String[] args) {
		// ���� 7�� �Է�, nextLine
		// char[] chars = pwd.toCharArray();
		// �迭�ӿ� �ϳ��� �ֱ� intarray > for > ave, min, max, sum
		// ���ǹ� ���� 7���� �ƴϸ� ���� �߻�

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		String number = sc.next();
		char[] chars = number.toCharArray();
		int sum = 0, ave = 0, min = 0, max = 0;

		
		for (int i = 0; i < chars.length; i++) {
			sum += chars[i];

			if (i == 0) {
				max = chars[i];
				min = chars[i];
			} else {
				if (chars[i] < min) {
					min = chars[i];
				}
				if (chars[i] > max) {
					max = chars[i];
				}
			}
		}
		ave = sum / num1;

		System.out.println("Average : " + ave);
		System.out.println("Minimum : " + min);
		System.out.println("Maximum : " + max);
		System.out.println("Summation : " + sum);

	}
}
