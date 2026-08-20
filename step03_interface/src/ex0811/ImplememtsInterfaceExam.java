package ex0811;

// 인터페이스의 메서드는 모두 public abstract
interface InterfaceExam00 {
	public abstract void interfaceExam00();
}

// 인터페이스는 인터페이스를 상속받을 수 있음
interface InterfaceExam01 extends InterfaceExam00 {
	// 인터페이스 필드는 자동 public static final
	int i = 767;
	int k = 999;

	// 인터페이스 메서드는 자동 public abstract
	void interfaceExam01(int i, int k);
}

interface InterfaceExam02 {
	// 인터페이스 필드는 자동 public static final
	int j = 747;
	int privateInt = 8;

	// 인터페이스 메서드는 모두 추상메서드
	abstract void interfaceExam02(int j);
}

class SuperClassExam {
	String superString = "Super";

	String superMethod() {
		System.out.println("SuperClassExam.SuperMethod()가 호출되었습니다.");
		return "returnString";
	}
}

// 인터페이스를 구현할 때는 implements 키워드를 사용
class SubClassExam01 extends SuperClassExam implements InterfaceExam01 {
	// InterfaceExam01이 상속한 InterfaceExam00의 추상메서드
	@Override
	public void interfaceExam00() {
		// TODO Auto-generated method stub
	}

	// InterfaceExam01의 추상메서드
	@Override
	public void interfaceExam01(int i, int k) {
		// TODO Auto-generated method stub
	}
}

class SubClassExam02 extends SuperClassExam implements InterfaceExam01, InterfaceExam02 {
	// InterfaceExam01이 상속한 InterfaceExam00의 추상메서드
	@Override
	public void interfaceExam00() {
		// TODO Auto-generated method stub

	}

	// InterfaceExam01의 추상메서드
	@Override
	public void interfaceExam01(int i, int k) {
		// TODO Auto-generated method stub

	}

	// InterfaceExam02의 추상메서드
	@Override
	public void interfaceExam02(int j) {
		// TODO Auto-generated method stub
	}
}

// 클래스 상속 extends, 인터페이스 구현 implements
abstract class SubClassExam03 extends SuperClassExam implements InterfaceExam01, InterfaceExam02 {

}

class SubClassExam04 extends SubClassExam02 {
	// 여기에 필요한 것들을 추가하여 문제를 해결하세요..
	@Override
	public void interfaceExam00() {
		// TODO Auto-generated method stub
	}

	@Override
	public void interfaceExam01(int i, int k) {
		// TODO Auto-generated method stub
	}

	@Override
	public void interfaceExam02(int j) {
		// TODO Auto-generated method stub
	}

	SubClassExam04() {
		System.out.println("subClassExam04() 객체 생성");
		System.out.println(" i = " + i);
		System.out.println(" j = " + j);
	}

	SubClassExam04(String s1, String s2) {
		System.out.println(s1 + " 타입 " + "subClassExam04(" + s2 + ") 객체 생성");
	}

	void printSuperString() {
		// 인터페이스는 객체를 생성할 수 없음
		/* InterfaceExam01 ie01 = new InterfaceExam01(); */

		System.out.println("superString = " + superString);
	}
}

// 여기서부터는 하나도 고치지 마시고 그대로 쓰면 됩니다.
public class ImplememtsInterfaceExam {
	public static void main(String args[]) {
		SubClassExam02 sub02sub04 = new SubClassExam04("SubClassExam02", "sub02sub04");
		sub02sub04.interfaceExam00();
		sub02sub04.interfaceExam01(1, 7);
		sub02sub04.superMethod();

		SuperClassExam superSub04 = new SubClassExam04("SuperClassExam", "superSub04");
		superSub04.superMethod();

		InterfaceExam01 ifc01Sub04 = new SubClassExam04("InterfaceExam01", "ifc01Sub04");
		ifc01Sub04.interfaceExam00();
		ifc01Sub04.interfaceExam01(1, 7);

		SubClassExam04 sub04 = new SubClassExam04();
		sub04.interfaceExam00();
		sub04.interfaceExam01(1, 7);
		sub04.superMethod();
	}
}