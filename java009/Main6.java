package java009;

import java.util.LinkedList;
import java.util.Queue;

// Queue에 Random 숫자(1~30) 중 2의 배수를 제외한 10개를 넣고 3의 배수만 출력할 것

public class Main6 {
	public static void main(String[] args) {
		Queue<Integer> name = new LinkedList<Integer>();
		for (int i = 0; name.size() < 10; i++) {
			int number = (int) (Math.random() * 30);
			if (number % 2 != 0) { // 2의 배수가 아니면
				name.offer(number); // 추가한다
			}
		}
		
		System.out.println(name);
		for (int i = 0; i < name.size(); i++) {
			int number = ((LinkedList<Integer>) name).get(i);
			if (number % 3 == 0) {
				System.out.print(number + " ");
			}
		}
	}
}
