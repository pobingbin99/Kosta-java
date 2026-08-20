package ex0810.abstract_final;

// final 클래스는 상속 불가능
// final 변수를 값 변경 불가능
final class FinalClassExam {
	final int i = -999999;
}

// abstract 메서드를 하나라도 가지면 abstract class
abstract class AbstractClassExam {
	// abstract 메서드는 구현부가 없음
	abstract String abstractMethodExam(int i, String s);

	final int finalMethodExam(int i, int j) {
		return i + j;
	}
}

// abstract 메서드를 구현하는 자식 클래스
class Sample01 extends AbstractClassExam {
	String abstractMethodExam(int i, String s) {
		System.out.println("return " + s + i);
		return s + i;
	}

	// 재정의 불가능 메서드는 오버라이딩 불가능
	/*int finalMethodExam(int i, int j) {
		return i * j;
	}*/
}

// final 클래스인 FinalClassExam 상속받지 못함
/*class Sample02 extends FinalClassExam {
}*/


class Sample03 extends AbstractClassExam {
	String abstractMethodExam(int i, String s) {
		return s + i;
	}

//	abstract String abstractMethodExam(int i, String s);

	void sampleMethod03() {
		System.out.println("void sampleMethod03() 호출 됨");
	}
}

class AbstractFinalClassTest {
	public static void main(String args[]) {
		// abstract 클래스는 객체를 생성할 수 없음
		/*AbstractClassExam ace = new AbstractClassExam();*/
		
//		FinalClassExam fce = new FinalClassExam();
		// final 변수의 값은 수정할 수 없음
		/*fce.i = 100000;*/
		
		Sample01 s01 = new Sample01();
		s01.abstractMethodExam(700, "_999");
		
		// abstract 클래스 타입으로 받을 수 있음
		AbstractClassExam aceS01 = new Sample01();
		aceS01.abstractMethodExam(700, "_999");
	}
}