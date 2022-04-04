package java007;

public class P9 {	//split
	public static void main(String[] args) {
		String words = "Kim,Lee,park";
		String[] names = words.split(",");
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			
		}
	}
}
