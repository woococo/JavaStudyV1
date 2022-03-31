package java002_A1;

public class A1 {
	public static void main(String[] args) {

		int i = 0, j = 0, result = 0;

		for (i = 2; i <= 9; i++) {
			for (j = 2; j <= 9; j++) {
				result = i * j;
				System.out.println(i + "X" + j + "=" + result);
				if (j == 9) {
					System.out.print("\n");
				}
			}
 		}
	}
}


// end