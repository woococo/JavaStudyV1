package review1;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String strOne = sc.next();
		String strTwo = sc.next();

		char[] oneArr = strOne.toCharArray();
		char[] twoArr = strTwo.toCharArray();
		int cnt = 0;

		Arrays.sort(oneArr);
		Arrays.sort(twoArr);

		if (oneArr.length == twoArr.length) {
			for (int i = 0; i < oneArr.length; i++) {
				if (oneArr[i] == twoArr[i]) {
					cnt++;
				}
			}
		}

		if (oneArr.length == cnt) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
