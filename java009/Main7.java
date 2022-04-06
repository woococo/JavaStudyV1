package java009;

import java.util.Stack;

// stack

public class Main7 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.add("Kim");
		System.out.println(stack);
		stack.add("Lee");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
	}
}
