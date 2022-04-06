package java009;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();
		String[] wordsArr = words.split(" ");
		
		ArrayList<String> wordsList = new ArrayList<String>();
		for (int i = 0; i < wordsArr.length; i++) {
			wordsList.add(wordsArr[i]);
		}
		
		Collections.sort(wordsList);
		System.out.println(wordsList);
	}
}
