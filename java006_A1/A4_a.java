package java006_A1;

import java.util.Scanner;

public class A4_a {
	public String[] inputNum() {
		Scanner sc = new Scanner(System.in);
		String numS = sc.next();
		String[] numSArr = numS.split(" ");
		return numSArr;
	}
}
