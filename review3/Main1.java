package review3;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numOne = 88;
		int numTwo = 93;
		
		int numOneS = 100 - numOne; // 12
		int numTwoS = 100 - numTwo; // 7
		
		int sum = numOneS + numTwoS; // 19
		int mul = numOneS * numTwoS; // 84
		
		int nums = 100 - sum;	// 81
		int result = (nums * 100) +  mul;
		
		System.out.println(numOne + " X " + numTwo + " = " + result);
		System.out.println(100 + "-" + numOne + "  " + 100 + "-" + numTwo );
		System.out.println("  " + numOneS + "   +   " + numTwoS + "   =   " + sum);
		System.out.println("  " + numOneS + "   X   " + numTwoS + "   =   " + mul);
		System.out.println("First two digits : " + 100 + " - " + sum + " = " + nums);
		System.out.println("Last two digits : " + mul);
		System.out.println("Result : " + result);
	}
}
