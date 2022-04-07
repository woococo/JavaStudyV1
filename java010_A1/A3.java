package java010_A1;

import java.util.Scanner;

public class A3 {
	public static void main(String[] args) {
		int rps = inputRps();
		int ret = rpsResult();
		printResult(rps, ret);
	}

	public static int inputRps() {
		Scanner sc = new Scanner(System.in);
		System.out.println("0 : Rock, 1 : Paper, 2 : Scissor");
		int rps = sc.nextInt();
		return rps;
	}

	public static int rpsResult() {
		int ret = (int) (Math.random() * 3);
		if (ret == 0) {
			System.out.println("Rock");
		} else if (ret == 1) {
			System.out.println("Paper");
		} else if (ret == 2) {
			System.out.println("Scissor");
		}
		return ret;
	}

	public static void printResult(int rps, int ret) {
		if (rps == ret) {
			System.out.println("Drow");
		} else if (rps == 0) {
			if (ret == 1) {
				System.out.println("Lose");
			} else if (ret == 2) {
				System.out.println("Win");
			}
		} else if (rps == 1) {
			if (ret == 0) {
				System.out.println("Win");
			} else if (ret == 2) {
				System.out.println("Lose");
			}
		} else if (rps == 2) {
			if (ret == 0) {
				System.out.println("Lose");
			} else if (ret == 1) {
				System.out.println("Win");
			}
		}
	}
}
