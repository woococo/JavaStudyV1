package java003;

import java.util.Calendar;
import java.util.Date;
import javax.xml.crypto.Data;
import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int inputYear = scanner.nextInt();
		int inputMonth = scanner.nextInt();
		
		System.out.println("\t\t\t[" + inputYear + "�� " + inputMonth + "��]");
		System.out.println("\t��\t��\tȭ\t��\t��\t��\t��");

		Calendar cal = Calendar.getInstance();
		cal.set(inputYear, inputMonth - 1, 1);

		// first ����
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);

		// �ش� ���� �Ѽ�
		int lastDate = cal.getActualMaximum(Calendar.DATE);

		// ù ���� ������ ����ó��
		for (int i = 1; i < firstDay; i++) {
			System.out.print("\t");
		}

		// ��¥ ���
		for (int i = 1; i <= lastDate; i++) {
			System.out.print((i < 10) ? "\t" + i : "\t" + i);

			if (firstDay % 7 == 0) {
				System.out.println();
			}
			firstDay++;
		}
	}
}