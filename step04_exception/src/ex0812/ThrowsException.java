package ex0812;

public class ThrowsException {
	public void aa(int i) throws ArithmeticException {
		System.out.println("aa 시작");
		
		try {
			bb(i);
		} finally {
			System.out.println("aa 끝");
		}
	}
	
	public void bb(int i) throws ArithmeticException {
		System.out.println("bb 시작");
		
		try {
			// ArithmeticException 예외 가능성
			int result = 100 / i;
			System.out.println("100 / i = " + result);
		} finally {
			System.out.println("bb 종료");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("----- 메인 시작 -----");
		
		ThrowsException te = new ThrowsException();
		
		try {
			te.aa(0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("----- 메인 종료 -----");
	}
}