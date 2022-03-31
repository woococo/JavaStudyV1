package java005;

import java.util.Scanner;

public class P3 {
	public static final String father = "Thomas";
	public static final String mother = "Kate";
	public static final String son = "John";
	public static final String daughter = "Alex";
	public static final int fatherNum = 1;
	public static final int motherNum = 2;
	public static final int sonNum = 3;
	public static final int daughterNum = 4;
	
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
		
		if (number == fatherNum) {
			name = father;
		} else if (number == motherNum) {
			name = mother;
		} else if (number == sonNum) {
			name = son;
		} else if (number == daughterNum) {
			name = daughter;
		} else {
			System.out.println("Error");
		}
		System.out.println(name);
	}
}