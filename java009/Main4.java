package java009;

import java.util.ArrayList;
import java.util.Collections;

public class Main4 {

	public static void main(String[] args) {
		ArrayList<String> numList = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			numList.add(Integer.toString((int) (Math.random() * 100)));
			Collections.sort(numList);
			Collections.reverse(numList);
			System.out.println(numList);
		}
	}
}