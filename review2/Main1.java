package review2;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String strOne = sc.next();
		String strTwo = sc.next();
		String strThree = sc.next();

		char[] oneArr = strOne.toCharArray();
		char[] twoArr = strTwo.toCharArray();
		char[] threeArr = strThree.toCharArray();
		String result = "";

		if (strOne.equals("0000") || strTwo.equals("0000") || strThree.equals("0000")) {
			result = "Pass";
		} else {
			for (int i = 0; i < 4; i++) {
				if (oneArr[i] == twoArr[i] && twoArr[i] == threeArr[i] && threeArr[i] == '0') {
					result = "Pass";
					break;
				} else {
					result = "Fail";
				}
			}
		}
		System.out.println(result);
	}
}
