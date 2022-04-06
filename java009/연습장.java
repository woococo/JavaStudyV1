package java009;

import java.util.ArrayList;
import java.util.Scanner;

public class ø¨Ω¿¿Â {
	public static void main(String[] args) {
		compareStrings();
	}

	static void compareStrings() {
		ArrayList<Character> s1 = new ArrayList<Character>();
		ArrayList<Character> s2 = new ArrayList<Character>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Input first word");
		String w1 = sc.nextLine();
		char[] c1 = w1.toCharArray();

		System.out.println("Input second word");
		String w2 = sc.nextLine();
		char[] c2 = w2.toCharArray();

		System.out.println("First sentence's size = " + c1.length);
		System.out.println("Second sentence's size = " + c2.length);

		// compare sentences by characterizing
		for (int i = 0; i < c1.length; i++) {
			s1.add(c1[i]);
		}

		for (int i = 0; i < c2.length; i++) {
			s2.add(c2[i]);
		}

		// remove duplication in one sentence
		ArrayList<Character> noDu1 = s1;
		ArrayList<Character> noDu2 = s2;

		for (int i = 0; i < s1.size() - 1; i++) {
			for (int j = i + 1; j < s1.size(); j++) {
				if (s1.get(i) == s1.get(j)) {
					noDu1.remove(i);
				}
			}
		}

		for (int i = 0; i < s2.size() - 1; i++) {
			for (int j = i + 1; j < s2.size(); j++) {
				if (s2.get(i) == s2.get(j)) {
					System.out.println(s2.get(i));
					noDu2.remove(i);
				}
			}
		}

		// count duplication between two sentences
		int count = 0;
		for (int i = 0; i < noDu1.size(); i++) {
			for (int j = 0; j < noDu2.size(); j++) {
				if (noDu1.get(i) == noDu2.get(j)) {
					count++;
				}
			}
		}

		System.out.println("Number of the same characters = " + count);
	}
}