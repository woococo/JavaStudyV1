package java004_A1;

import java.util.Arrays;
import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt(); // 주사위의 개수
		int sum = sc.nextInt();	// 합
		int diceNum = 0;
		
		int[] result = new int[6];
		
		while (true) 
		{
			for(int i = 0; i < num; i++) {
				for(int j = 0; j < 6; j++) {
					result[j] = j + 1;
				}
				
				result[i] = result[i]* i;
			}
			if (diceNum == num) {
				break;
			}
		}
	}
}