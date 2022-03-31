package java003;

import java.util.Scanner;

public class P2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.next();
		
		char[] chars = line.toCharArray();
		
		for (int i = 0; i <= line.length(); i++) {
			if (chars[i] < 97 && chars[i] >= 65) { // 대문자일 경우
				chars[i] += 32;		// 32를 더해서 소문자로 만들기
			} else if( chars[i] >= 97) {	// 소문자일 경우
				chars[i] -= 32;		// 32를 빼서 대문자로 만들기
			}
			System.out.println(chars[i]);
		}
	}
}

// 띄어쓰기를 하면 출력이 안됨
// 21라인 ln을 빼면 오류발생 