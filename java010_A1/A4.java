package java010_A1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class A4 {
	public static void main(String[] args) throws IOException{
		BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\501-10\\Desktop\\trafficvolume.csv"));
		String line;
		int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		ArrayList<Integer> output = new ArrayList<Integer>();
		while ((line = read.readLine()) != null) {
			String[] cutLine = line.split(",");
			if (cutLine[1].equals("¸ñ")) {
				try {
					output.add(Integer.parseInt(cutLine[20]));
				} catch (Exception e) {
					
				}
			}
		}
		for (int i = 0; i < output.size(); i++) {
			sum += output.get(i);
			min = Math.min(min, output.get(i));
			max = Math.max(max, output.get(i));
		}
		System.out.println("min : " + min + " max : " + max + " sum : " + sum + " avg : " + sum/output.size());
	}
}
