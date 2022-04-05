package java008;

import java.util.Scanner;

public class P1 {
	static Scanner sc = new Scanner(System.in);
	static String firstInput = "";
	static String secondInput = "";
	
	public static void main(String[] args) {
		inputData();
		printResult();
	}
	
	public static void inputData() {
		firstInput = sc.nextLine();
		secondInput = sc.nextLine();
	}
	
	public static void printResult() {
		String[] firstArr = firstInput.split(" ");
		String[] secondArr = secondInput.split(" ");
		float firstArrFlo[] = new float[firstArr.length];
		float secondArrFlo[] = new float[secondArr.length];
		
		for (int i = 0; i < firstArr.length; i++) {
			firstArrFlo[i] =  Float. parseFloat(firstArr[i]);
			
		}
		for (int i = 0; i < secondArr.length; i++) {
			secondArrFlo[i] =  Float. parseFloat(secondArr[i]);
		}
		
		for (int i = 0; i < firstArrFlo.length; i++) {
			for (int j = 0; j < secondArrFlo.length; j++) {
				if (firstArrFlo[i] == (secondArrFlo[j])) {
					System.out.print(firstArrFlo[i] + " ");
				} else 
					continue;
			}
		}
	}
}

