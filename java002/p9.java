package java002;

import java.util.Scanner;

import org.w3c.dom.Text;

public class p9 {
	public static void main(String[] args) {
		// TODO Auto-generated catch block
		Scanner scanner = new Scanner(System.in);
		String text;
		text = scanner.nextLine();
		
		if (text.contains("car") == true) {
			System.out.println("car is included in the input string.");
		} else {
			System.out.println("car is not included in the input string.");
		}
		
		System.out.println(text);
	}
}
