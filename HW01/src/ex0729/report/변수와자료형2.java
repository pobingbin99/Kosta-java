package ex0729.report;

public class 변수와자료형2 {
	public static void main(String[] args) {
		String name = "이은진";
		
		int kor = (int)(Math.random() * 56 + 45);
		int eng =  (int)(Math.random() * 56 + 45);
		int math =  (int)(Math.random() * 56 + 45);
		
		int sum = kor + eng + math;
		double avg = (int) (sum / 3.0 * 100) / 100.0;
		
		char grade = switch ((int)avg / 10) {
		    case 10, 9 -> 'A';
		    case 8 -> 'B';
		    case 7 -> 'C';
		    case 6 -> 'D';
		    default -> 'F';
		};
		
		System.out.println("이름: " + name);
		System.out.println("국어점수: " + kor + ", 영어점수: " + eng + ", 수학점수: " + math);
		System.out.println("총점: " + sum + ", 평균: " + avg + ", 학점: " + grade);
	}
}