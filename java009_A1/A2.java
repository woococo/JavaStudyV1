package java009_A1;

import java.util.ArrayList;
import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstWord = sc.next();
		String secondWord = sc.next();
		printResult(firstWord, secondWord);
	}

	public static void printResult(String firstWord, String secondWord) {
		ArrayList<Character> firstList = new ArrayList<Character>();
		ArrayList<Character> secondList = new ArrayList<Character>();
		char[] firstArr = firstWord.toCharArray();
		char[] secondArr = secondWord.toCharArray();
		int result = 0;

		add(firstArr, firstList);
		add(secondArr, secondList);

		// 첫번째단어의 중복 알파벳 제거
		if (firstList.size() <= secondList.size()) {
			System.out.println("1 : " + firstList.size());
			System.out.println("2 : " + secondList.size());
			for (int i = 0; i < firstList.size(); i++) {
				for (int j = i + 1; j < firstList.size(); j++) {
					if (firstList.get(i) == firstList.get(j)) {
						firstList.remove(i);
					}
				}
			}

			for (int i = 0; i < firstList.size(); i++) {
				if (secondList.contains(firstList.get(i)) == true) {
					result++;
				}
			}
			System.out.println("3 : " + result);
		} else {
			System.out.println("Error");	// 두번째 단어가 첫번째 단어와 같거나 길어야 함
		}

	}

	public static void add(char[] arr, ArrayList<Character> list) {
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
	}
}
