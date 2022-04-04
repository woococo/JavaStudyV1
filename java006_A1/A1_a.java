package java006_A1;

import java.util.Scanner;

public class A1_a {
	public static int count = 0;
	public static String subject[] = new String[5];
	static Scanner sc = new Scanner(System.in);

	public static void mainMenu() {
		System.out.println("== Menu == \n1. Course List\n2. My Course");
		System.out.print("-> ");
		int menu = sc.nextInt();
		System.out.println("");
		if (menu == 1) {
			courseMenu();
		} else if (menu == 2) {
			myCourseList();
		} else {
			System.out.println("Error!");
			mainMenu();
		}
	}

	public static void courseMenu() {
		int chooseCourse = 6;
		
		while (chooseCourse != 0) {
			System.out.println("== Course List ==\n1. Korean\n2. Math\n3. English");
			System.out.println("4. Social Studies\n5. Science\n0. Back to Main");
			System.out.print("-> ");
			chooseCourse = sc.nextInt();
			System.out.println("");

			if (chooseCourse == 1) {
				subject[count] = "Korean";
				System.out.println("\"Korean\" is registered.");
			} else if (chooseCourse == 2) {
				subject[count] = "Math";
				System.out.println("\"Math\" is registered.");
			} else if (chooseCourse == 3) {
				subject[count] = "English";
				System.out.println("\"English\" is registered.");
			} else if (chooseCourse == 4) {
				subject[count] = "Social Studies";
				System.out.println("\"Social Studies\" is registered.");
			} else if (chooseCourse == 5) {
				subject[count] = "Science";
				System.out.println("\"Science\" is registered.");
			} else if (chooseCourse == 0) {
				continue;
			} else {
				System.out.println("Error!");
				mainMenu();
			}
			System.out.println("");
			count++;
		}
		mainMenu();
	}

	public static void myCourseList() {
		System.out.println("== My Cournse ==");
		for (int i = 0; i < count; i++) {
			System.out.println(i + 1 + " " + subject[i]);
		}
		System.out.println("- End -");
		System.out.print("-> ");
		int next = sc.nextInt();
		if (next == 0) {
			mainMenu();
		} 
	}
}
