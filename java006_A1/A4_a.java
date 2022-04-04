package java006_A1;

import java.util.Scanner;

public class A4_a {
	static Scanner sc = new Scanner(System.in);
	float target;
	float near = 0;

	String[] inputData() {
		String numbers = sc.nextLine();
		String[] numArray = numbers.split(" ");
		target = sc.nextFloat();
		return numArray;
	}

	float process(String[] numArray) {
		float min = Float.MAX_VALUE;

		for (int i = 0; i < numArray.length; i++) {
			float diff = Math.abs((Float.parseFloat(numArray[i]) - target));
			if (min > diff) {
				if (diff == 0) {
					continue;
				} else {
					min = diff;
					near = Float.parseFloat(numArray[i]);
				}
			}
		}
		return near;
	}

	void printResult() {
		System.out.println(near);
	}

}