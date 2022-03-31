package java002_A1;

public class A2 {
	public static void main(String[] args) {

		int i = 2, j = 2;
		int count = 0, result = 0;
		while (i <= 9) {
			while (j <= 9) {
				switch (count) {
				case 0:
					result = i * j;
					System.out.println(i + "X" + j + "=" + result);
					j++;
					break;
				}
			}
			j = 2;
			i++;
			System.out.println("");
		}
	}
}

