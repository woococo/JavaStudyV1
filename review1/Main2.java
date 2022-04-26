package review1;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double numOne = sc.nextDouble();
		double numTwo = sc.nextDouble();
		double numThree = sc.nextDouble();
		double result = 0;
		String text;
		
		if (numOne * 3.6 >= numTwo) {
			if (numOne * 3.6 >= numThree * 3600) {
				result = numOne * 3.6;
				text = "m/s";
			} else {
				result = numThree * 3600;
				text = "m/ms";
			}
			
		} else {
			if (numTwo >= numThree * 3600) {
				result = numTwo;
				text = "km/h";
			} else {
				result = numThree * 3600;
				text = "m/ms";
			}
			
		}
		System.out.println(result + text);
	}
}


// 제가 누구인지 맞추면 떡볶이 사드립니다. - 귀신1
// 끄고싶다