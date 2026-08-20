package ex0812;

public class ExceptionReturnExam {
	public void aa (int i) {
		System.out.println("----- aa(int i) 시작 -----");
		
		try {
			if (i == 0) return;
			System.out.println(i + "입니다.");
		} finally {
			System.out.println("----- aa(int i) 종료 -----");
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("----- 메인 시작 -----");
		
		new ExceptionReturnExam().aa(0);
		
		System.out.println("----- 메인 종료 -----");
	}
}