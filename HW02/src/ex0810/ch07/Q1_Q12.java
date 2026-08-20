package ex0810.ch07;

public class Q1_Q12 {
	/*
	 * Q1) 정답 1번 다른 언어와 달리 자바는 다중 상속을 허용하지 않는다.
	 */

	/*
	 * Q2) 정답 2번 부모 객체를 자식 타읍으로 변환하는 것은 다운캐스팅이다. 다운 캐스팅은 업 캐스팅과 달리 직접 명시해야 한다.
	 */

	/*
	 * Q3) 정답 1번 final 키워드가 붙으면 해당 클래스는 상속이 불가능하다.
	 */

	/*
	 * Q4) 정답 4번 public, protected 접근 제한자를 같는 메소드는 다른 패키지 자식 클래스에서 오버라이딩 가능하다.
	 */
	
	/*
	 * Q5) 정답 2번 추상 클래스는 추상 메서드를 0개 이상 가질 수 있다. (0개 가능)
	 */
	
	/*
	 * Q6) Parent 클래스에 기본 생성자가 Parent()가 없다.
	 * 문자열 인자를 전달받는 Parent의 생성자를 직접 명시해야 한다.
	 */
	public class Parent {
		public String name;
		
		public Parent(String name) {
			this.name = name;
		}
	}
	
	public class Child extends Parent {
		public int studentNo;
		
		public Child(String name, int studentNo) {
			super(name);
			this.studentNo = studentNo;
		}
	}
	
	/*
	 * Q7) 정답
	 * Parent(String nation) call
	 * Parent() call
	 * Child(String name) call
	 * Child() call
	 */
	
	/*
	 * Q8) 정답
	 * 스노우 타이어가 굴러갑니다.
	 * 스노우 타이어가 굴러갑니다.
	 * 
	 *  snowTire, tire 둘 다 런타임에는 SnowTire에서 오버라이딩한 run() 메서드가 호출된다.
	 */
	
	/*
	 * Q9) 정답 2번 
	 * new A()로 생성된 객체는 부모 클래스 A의 객체이다.
	 * 자식 클래스인 B로 다운 캐스팅은 불가능하다.
	 */
	
	/*
	 * Q11) 정답 super
	 */
	
	/*
	 * Q12) 정답 a instanceof C c
	 */
	public static void main(String[] args) {
	}
}