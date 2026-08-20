package ex0811.ch08.Q8;

/*
 * 인터페이스 A의 추상메서드 method1() 오버라이딩
 * 추가적으로 method2() 정의
 */
public class C implements A {
	@Override
	public void method1() {
		System.out.println("C - method1()");
	}
	
	public void method2() {
		System.out.println("C - method2()");
	}
}