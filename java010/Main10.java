package java010;

import java.io.FileInputStream;
import java.io.IOException;

public class Main10 {
	public static void main(String[] args) throws IOException{
		byte[] content = new byte[1000];
		FileInputStream input = new FileInputStream("C:\\Users\\501-10\\Desktop\\out.txt");
		input.read(content);
		String allLine = new String(content);
		System.out.println(allLine);
		input.close();
	}
}
