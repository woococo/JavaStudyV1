package java004_A1;

import java.util.Scanner;

public class P4 { // Encryption and Decryption

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==MENU==\n1. Encryption\n2. Decryption");

		int menu = sc.nextInt();
		String pwd = sc.next();

		char[] chars = pwd.toCharArray();

		for (int i = 0; i < pwd.length(); i++) {
			if (menu == 1) {
				if ((i + 1) % 2 != 0) {				// ¦�� ��° ��ȣ��
					chars[i] += 1; 					// ���� ���ĺ�����
				} else if ((i + 1) % 2 == 0) { 		// Ȧ�� ��° ��ȣ��
					chars[i] -= 1; 					// ���� ���ĺ�����
				}
			} else if (menu == 2) {
				if ((i + 1) % 2 != 0) {
					chars[i] -= 1;
				} else if ((i + 1) % 2 == 0) {
					chars[i] += 1;
				}
			}
			System.out.print(chars[i]);
		}

	}
}

//end