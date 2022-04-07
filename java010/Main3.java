package java010;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printResult();
	}
	
	public static void printResult() {
		int number = 1;
		for (int i = 0; i <100; i++) {
			try {
				System.out.println(number++);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
