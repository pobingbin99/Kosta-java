package step05_lambda; 

public class MainApp {
	public static void main(String[] args) {
		/*
		 * 인터페이스안에 메소드가 한 개 있을 경우 람다식 사용 가능
		 * 단, 기능이 있는 default, static 메서드 등은 가능
		 * @FunctionalInterface 어노테이션 사용
		 */
		AInterface a = () -> System.out.println("AInterface void aa()");
		a.aa();
		
		BInterface b = (i) -> System.out.println("BInterface void bb(" + i + ")");
		b.bb(10);
		
		CInterface c = (i1, i2) -> "CInterface String cc(" + i1 + "," + i2 + ")";
		System.out.println(c.cc(10, 20));
	}
}