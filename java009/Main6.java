package java009;

import java.util.LinkedList;
import java.util.Queue;

// Queue�� Random ����(1~30) �� 2�� ����� ������ 10���� �ְ� 3�� ����� ����� ��

public class Main6 {
	public static void main(String[] args) {
		Queue<Integer> name = new LinkedList<Integer>();
		for (int i = 0; name.size() < 10; i++) {
			int number = (int) (Math.random() * 30);
			if (number % 2 != 0) { // 2�� ����� �ƴϸ�
				name.offer(number); // �߰��Ѵ�
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
