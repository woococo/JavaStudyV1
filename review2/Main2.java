package review2;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Current Date : ");
		int strOne = sc.nextInt();
		System.out.println("Birthday : ");
		int strTwo = sc.nextInt();

		int kAge = (strOne - strTwo) / 10000 + 1;
		int iAge = (strOne - strTwo) / 10000;
		
		System.out.println(kAge + " years old in Korean age");
		System.out.println(iAge + " years old in international age");
	}
}
