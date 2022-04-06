package java009;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		HashSet<Integer> list = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			list.add(sc.nextInt());
			List<Integer> numList = new ArrayList<>(list);
			System.out.println(numList);
			Collections.sort(numList);
			System.out.println(numList);
			Collections.reverse(numList);
			System.out.println(numList);
		}
	}
}