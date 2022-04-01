package java006_A1;

import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class A1_a {
	Scanner sc = new Scanner(System.in);
	String[] courseArr = new String[5];

	public void choiceMainMenu() {
		System.out.println("== Menu ==\n1. Course List\n2. My course");
		int chooseMainMenu = sc.nextInt();
		if (chooseMainMenu == 1) {
			courseMenu();
		} else if (chooseMainMenu == 2) {
			myCourseList();
		} else {
			System.out.println("\nError!");
			choiceMainMenu();
		}
	}

	public void courseMenu() {
		int chooseCourseMenu = 7;
		int count = 0;

		while (chooseCourseMenu != 0) {
			System.out.println(
					"\n== Course List ==\n1. Korean\n2. Math\n3. English\n4. Social Studies\n5. Science\n0. Back to Main");
			chooseCourseMenu = sc.nextInt();

			if (chooseCourseMenu == 1) {
				System.out.println("\n\"Korean\" is registered");
				courseArr[count] = "Korean";
			} else if (chooseCourseMenu == 2) {
				System.out.println("\n\"Math\" is registered");
				courseArr[count] = "Math";
			} else if (chooseCourseMenu == 3) {
				System.out.println("\n\"English\" is registered");
				courseArr[count] = "English";
			} else if (chooseCourseMenu == 4) {
				System.out.println("\n\"Social Studies\" is registered");
				courseArr[count] = "Social Studies";
			} else if (chooseCourseMenu == 5) {
				System.out.println("\n\"Science\" is registered");
				courseArr[count] = "Science";
			} else if (chooseCourseMenu == 0) {
				System.out.println("");
				choiceMainMenu();
			} else {
				System.out.println("Error!");
			}
			count++;
		}
	}

	public void myCourseList() {
		System.out.println("== My Course ==");
		for (int i = 0; i <= courseArr.length + 1; i++) {
			System.out.println(i + 1 + "." + courseArr[i]);
		}
		System.out.println("==END==");

	}
}
