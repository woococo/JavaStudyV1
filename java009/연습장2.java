package java009;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ø¨Ω¿¿Â2 {

	public static void main(String[] args) {
		result();
	}

	public static void result() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numList = new ArrayList<Integer>();
		int number, result = 1, mean = 0, max = 0, min = 0;
		
		while (true) {
			number = sc.nextInt();
			numList.add(number);
			mean += number;
		
			Collections.sort(numList);
			min = numList.get(0);
			
			Collections.reverse(numList);
			max = numList.get(0);
			
			System.out.println("Result : " + result + " - Mean " + mean / numList.size() + ", Max " + max + ", Min " + min);
			System.out.println();
			result++;
		}
	}
}