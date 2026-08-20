package ex0812.ch11;

public class Q5 {
	/*
	 * 정답 3번
	 * ClassNotFoundException 클래스는 Exception 클래스의 자식 클래스이다.
	 * 따라서, ClassNotFoundException 예외는 더 먼저 위치한 catch(Exception e)에서 전부 잡히게 된다.
	 * Unreachable catch block for ClassNotFoundException. It is already handled by the catch block for Exception
	 */
	
	/*
	 * 올바르게 수정한 코드
	 */
	public void method1() throws NumberFormatException, ClassNotFoundException {
		
	}
	
	public static void main(String[] args) {	
		try {
			new Q5().method1();
		} catch(ClassNotFoundException e) {
			// 생략
		}catch(Exception e) {
			// 생략
		} 
	}
}
