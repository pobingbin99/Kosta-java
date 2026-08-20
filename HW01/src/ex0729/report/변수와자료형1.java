package ex0729.report;

public class 변수와자료형1 {
	public static void main(String[] args) {
		String name = "이은진";
		
		int kor = (int)(Math.random() * 56 + 45);
		int eng =  (int)(Math.random() * 56 + 45);
		int math =  (int)(Math.random() * 56 + 45);
		
		int sum = kor + eng + math;
		double avg = (int) (sum / 3.0 * 100) / 100.0;
		char grade = 'F';
		
		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else if (avg >= 60) {
			grade = 'D';
		}
		
		System.out.println("이름: " + name);
		System.out.println("국어점수: " + kor + ", 영어점수: " + eng + ", 수학점수: " + math);
		System.out.println("총점: " + sum + ", 평균: " + avg + ", 학점: " + grade);
	}
}