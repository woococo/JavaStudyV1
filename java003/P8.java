package java003;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class P8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Date date = null;
		
		String date1 = scanner.next();
		int addDate = scanner.nextInt();
		
		try {
			date = dateFormat.parse(date1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		calendar.setTime(date);
		calendar.add(Calendar.DATE, addDate);
		
		System.out.println(dateFormat.format(calendar.getTime()));
	}

}


//end