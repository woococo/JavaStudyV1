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
		char[] threeArr = strTwo.toCharArray();
		
		if (oneArr[2] == twoArr[2] && threeArr[2] == twoArr[2] ) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}
