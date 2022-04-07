package java010;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P8 {
	public static void main(String[] args) {
		result();
	}

	public static void result() {
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		sc.nextLine();
		int[] inputArr = new int[inputNum];

		String str = sc.nextLine();
		String[] strArr = str.split(" ");

		try {
			for (int i = 0; i < strArr.length; i++) {
				inputArr[i] = Integer.parseInt(strArr[i]);
			}
			Arrays.sort(inputArr);
			for (int n : inputArr) {
				System.out.print(n + " ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
	}
}
