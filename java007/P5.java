package java007;

public class P5 {	// Descriptive Statistics
	public static void main(String[] args) {
		String[] student = { "Jeong", "Pyo", "Choi" };
		String[] subject = { "Korean", "English", "Math" };
		int[][] score = new int [student.length][subject.length];
		score[0][0] = 70;
		score[0][1] = 80;
		score[0][2] = 100;
		score[1][0] = 60;
		score[1][1] = 70;
		score[1][2] = 86;
		score[2][0] = 54;
		score[2][1] = 100;
		score[2][2] = 82;
		score[3][0] = 87;
		score[3][1] = 95;
		score[3][2] = 79;
		
		int[] studentSummation = new int[subject.length];
		float[] studentAverage = = new int[subject.length];
		int[] studentMinimun = new int[subject.length];
		int[] studentMaximum = new int[subject.length];
		int[] subjectSummation = new int[student.length];
		float[] subjectAverage = new int[student.length];
		int[] subjectMinimun = new int[student.length];
		int[] subjectMaximum = new int[student.length];
		
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < subject.length; j++) {
				studentSummation[i] += score[0][j];
				
			}
			
		}
		
	}

}
