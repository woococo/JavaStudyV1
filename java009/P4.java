package java009;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<Integer> score = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			name.add(sc.next());
			score.add(sc.nextInt());
		}
		
		System.out.println(name);
		System.out.println(score);
		
		Collections.sort(name);
		System.out.println(name);
		
		Collections.reverse(name);
		System.out.println(name);
		
		Collections.sort(score);
		System.out.println(score);
		
		Collections.reverse(score);
		System.out.println(score);
	
	}

}
