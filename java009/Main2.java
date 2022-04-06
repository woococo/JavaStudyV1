package java009;

import java.util.ArrayList;
import java.util.Collections;

public class Main2 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			numList.add((int) (Math.random() * 100));
		}
		
		Collections.sort(numList);
		Collections.reverse(numList);
		System.out.println(numList);
		
		numList.remove((numList.size() / 2));
		numList.remove((numList.size() / 2));
		System.out.println(numList);
	}
}
