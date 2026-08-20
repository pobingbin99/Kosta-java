package ex0811.ch08.Q8;

/*
 * 인터페이스 A의 추상메서드 method1() 오버라이딩
 */
public class B implements A {
	@Override
	public void method1() {
		System.out.println("B - method1()");
	}
}