package java010;

import java.io.File;

public class Main14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("C:\\Users\\501-10\\Desktop\\out.txt");
		File files[] = dir.listFiles();

		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
	}

}
