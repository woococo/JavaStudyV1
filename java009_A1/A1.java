package java009_A1;

import java.util.ArrayList;
import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		printResult(inputNum);
	}

	public static int sum(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return sum(n - 2) + sum(n - 1);
		}
	}
	
	public static void printResult(int n) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			numList.add(sum(i));
		}
		System.out.println(numList);
	}
}	

