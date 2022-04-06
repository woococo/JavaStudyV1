package java009;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> numList = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int output = sc.nextInt();
		String[] cutInput = input.split(" ");
		int count = 0;
		
		for (int i = 0; i < cutInput.length; i++) {
			numList.add(Integer.parseInt(cutInput[i]));
		}
		
		if(input.contains(String.valueOf(output))) {
			for (int i = 0; i < numList.size(); i++) {
				if (numList.pop().equals(output)) {
					System.out.println(i + 1);
					count++;
					break;
				} else {
					count++;
				}
			}
		}
		
		if(count == 0) {
			System.out.println("Error");
		}
	}
}
