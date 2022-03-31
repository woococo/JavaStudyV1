package java004_A1;

import java.util.Scanner;

public class 연습장 {
	public static void main(String[] args) {
		// 숫자 7개 입력, nextLine
		// char[] chars = pwd.toCharArray();
		// 배열속에 하나씩 넣기 intarray > for > ave, min, max, sum
		// 조건문 숫자 7개가 아니면 오류 발생

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
