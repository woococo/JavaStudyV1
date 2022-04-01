package java006_A1;

public class A5 {
	public static void main(String[] args) {
		A5_a A5_a = new A5_a();
		A5_a.printMenu();
		String[] selectArr = A5_a.inputData();
		int inputNumber = A5_a.inputNum();
		A5_a.process(selectArr, inputNumber);
	}
}
