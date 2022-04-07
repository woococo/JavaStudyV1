package java010;

import java.io.File;

public class Main13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File ("C:\\Users\\501-10\\Desktop\\out.txt");
		System.out.println(file.exists());
		if (file.exists()) {
			file.delete();
		}
		System.out.println(file.exists());
	}

}
