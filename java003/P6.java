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
		
		System.out.println("\t\t\t[" + inputYear + "년 " + inputMonth + "월]");
		System.out.println("\t일\t월\t화\t수\t목\t금\t토");

		Calendar cal = Calendar.getInstance();
		cal.set(inputYear, inputMonth - 1, 1);

		// first 요일
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);

		// 해당 월의 총수
		int lastDate = cal.getActualMaximum(Calendar.DATE);

		// 첫 요일 전까지 공백처리
		for (int i = 1; i < firstDay; i++) {
			System.out.print("\t");
		}

		// 날짜 출력
		for (int i = 1; i <= lastDate; i++) {
			System.out.print((i < 10) ? "\t" + i : "\t" + i);

			if (firstDay % 7 == 0) {
				System.out.println();
			}
			firstDay++;
		}
	}
}