package java009;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> numList = new ArrayList<String>();

		for (int i = 0; i < 10; i++) {
			numList.add(Integer.toString((int) (Math.random() * 100)));
		}

		Collections.sort(numList);
		System.out.println(numList);

		Collections.reverse(numList);
		System.out.println(numList);
	}
}
