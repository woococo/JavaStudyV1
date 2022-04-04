package java007;

public class P4 {
    public static void main(String args[]) {
    	int[] numArr = {2, 33, 7, 5, 12, 34, 99, 24, 28, 53, 20};
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
		
		// 내림차순
        for (int i = 0; i < numArr.length; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                if (numArr[i] > numArr[j]) {
                    int pivot = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = pivot;
                }
            }
        }
 
        System.out.print("내림차순 : ");
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + " ");
        }
        System.out.println();
 
        // 오름차순
        for (int i = 0; i < numArr.length; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                if (numArr[i] < numArr[j]) {
                    int pivot = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = pivot;
                }
            }
        }
 
        System.out.print("오름차순 : ");
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + " ");
        }
        System.out.println();
    }
}