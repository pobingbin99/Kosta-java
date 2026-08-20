package ex0806.finalex;

/**
 * final 필드는 반드시 초기화 필수
 * 1) 직접 명시적으로 초기화
 * 2) 생성자 안에서 초기화
 * static final 필드가 진정한 상수이다.
 * -> 직접 명시적으로 초기화 or static 블록
 */
public class FinalFieldExam {
	final int 가짜상수;
	static final int 진짜상수 = 202012142;
	
	public FinalFieldExam() {
		 가짜상수= 10;
	}
	public FinalFieldExam(int num) {
		가짜상수 = num;
	}
	
	public static void main(String[] args) {
		FinalFieldExam fe = new FinalFieldExam();
		
		System.out.println(fe.가짜상수);
		System.out.println(FinalFieldExam.진짜상수);
	}
}