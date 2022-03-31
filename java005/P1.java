package java005;

import java.util.Scanner;

public class P1 {
	
	public static void main(String[] args) {
		P1 P1 = new P1();
		P1.menu();
		String name = null;
		P1.printName(name);
	}
	void menu() {
		System.out.println("==Printing a Name==");
		System.out.println("1. Father\n2. Mother\n3. Son\n4. Dugher");
	}
	
	void printName(String name2) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String name = null;
		
		if (number == 1) {
			name = "Thomas";
		} else if (number == 2) {
			name = "Kate";
		} else if (number == 3) {
			name = "John";
		} else if (number == 4) {
			name = "Alex";
		} else {
			System.out.println("Error");
		}
		System.out.println(name);
	}
}
