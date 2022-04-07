package java010;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {5, 10, 12};
		
		try {
			System.out.println(numbers[3]);
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("NullPointer Exception");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("General exception");
		} finally {
			System.out.println("finally");
		}
	}

}
