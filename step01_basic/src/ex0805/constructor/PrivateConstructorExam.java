package ex0805.constructor;

/**
 * 싱글톤 클래스 작성 방법
 * 1) private 생성자를 만든다.
 * 2) 객체를 static 필드로 선언한다.
 * 3) 객체를 반환하는 static 메서드를 정의한다.
 */

class Test {
	private static Test instance = new Test();
	
	private Test() {
	}
	
	public static Test getInstance() {
		return instance;
	}
}

public class PrivateConstructorExam {
	public static void main(String[] args) {
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();
		
		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
	}
}