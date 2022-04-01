package java006_A1;

import java.util.Scanner;

public class A5_a {
	static double CENTIMETERS = 100;
	static double METERS = 1;
	static double MILLIMETERS = 1000;
	static double KILOMETERS = 0.001;
	static double MILES = 0.00062;

	public void printMenu() {
		System.out.println("# Unit \n1. cm\n2. m\n3. mm\n4. km\n5. mile");
	}

	public String[] inputData() {
		Scanner sc = new Scanner(System.in);
		String inpuSelects = sc.nextLine();
		String[] selectArr = inpuSelects.split(" ");
		return selectArr;
	}

	public int inputNum() {
		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		return inputNumber;
	}

	public void process(String[] selectArr, int inputNumber) {
		double result = 0;
		double selectOne = Integer.parseInt(selectArr[0]);
		double selectTwo = Integer.parseInt(selectArr[1]);
		if(selectOne == 1) {
			selectOne = CENTIMETERS;
		} else if(selectOne == 2) {
			selectOne = METERS;
		} else if(selectOne == 3) {
			selectOne = MILLIMETERS;
		} else if(selectOne == 4) {
			selectOne = (int) KILOMETERS;
		} else if(selectOne == 5) {
			selectOne = (int) MILES;
		}
		if(selectOne == 1) {
			selectTwo = CENTIMETERS;
		} else if(selectOne == 2) {
			selectTwo = METERS;
		} else if(selectOne == 3) {
			selectTwo = MILLIMETERS;
		} else if(selectOne == 4) {
			selectTwo = (int) KILOMETERS;
		} else if(selectOne == 5) {
			selectTwo = (int) MILES;
		}
		double factor = selectOne / selectTwo;
		result = inputNumber * factor;
		printResult(result);
	}

	public void printResult(double result) {
		System.out.println(result);
	}
}
