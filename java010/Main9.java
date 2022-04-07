package java010;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main9 {
	public static void main(String[] args) throws IOException{
		FileOutputStream output = new FileOutputStream("C:\\Users\\501-10\\Desktop\\out.txt");
		for (int i = 1; i < 11; i++) {
			String data = "Line #" + i + "\n";
			output.write(data.getBytes());
		}
		output.close();
	}
	
}
