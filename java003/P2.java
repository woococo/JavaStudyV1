package java003;

import java.util.Scanner;

public class P2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.next();
		
		char[] chars = line.toCharArray();
		
		for (int i = 0; i <= line.length(); i++) {
			if (chars[i] < 97 && chars[i] >= 65) { // �빮���� ���
				chars[i] += 32;		// 32�� ���ؼ� �ҹ��ڷ� �����
			} else if( chars[i] >= 97) {	// �ҹ����� ���
				chars[i] -= 32;		// 32�� ���� �빮�ڷ� �����
			}
			System.out.println(chars[i]);
		}
	}
}

// ���⸦ �ϸ� ����� �ȵ�
// 21���� ln�� ���� �����߻� 