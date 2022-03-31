package java002;

import java.util.Scanner;

import org.w3c.dom.Text;

public class p10 {
	public static void main(String[] args) {
		// TODO Auto-generated catch block
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		
		if (sentence.toUpperCase().contains("CAR") || sentence.toLowerCase().contains("CAR")){
			System.out.println("car is included in the input string.");
		} else {
			System.out.println("car is not included in the input string.");
		}

		System.out.println(sentence);
	}
}