package ex0811.ch08.Q8;

/*
 * method2() 메서드는 C 타입 클래스만 실행할 수 있음
 * instanceof 연산자를 이용해 인터페이스 A 타입으로 전달받은 매개변수 a의 실제 타입이 C인지 판단
 */
public class Example {
	public static void action(A a) {
		a.method1();
	
		if (a instanceof C c) {
			c.method2();
		}
	}
	
	public static void main(String[] args) {
		action(new B());
		action(new C());
	}
}
