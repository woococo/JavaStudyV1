package java003;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P7 {
	
	public static void main(String[] args) throws ParseException {
    	Scanner scanner = new Scanner(System.in);
    	
        String date1 = scanner.next(); //날짜1
        String date2 = scanner.next(); //날짜2
    
        Date format1 = new SimpleDateFormat("yyyyMMdd").parse(date1);
        Date format2 = new SimpleDateFormat("yyyyMMdd").parse(date2);
                
        long diffDays = (format2.getTime() - format1.getTime()) / 1000 / (24*60*60); //일자수 차이

        System.out.println(diffDays);
    }
}