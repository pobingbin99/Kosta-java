package ex0803.staticex;

class Test {
	int a;
	static int b;
	
	// static 필드는 this 이용한 접근 지양
	public void method1() {
		System.out.println(a);
		System.out.println(this.a);
		
		System.out.println(b);
//		System.out.println(this.b);
		System.out.println(Test.b);
	}
	
	// static 메서드 안에서는 static 변수만 접근 가능
	// static 메서드 안에서는 this 사용 불가능
	public static void method2() {
//		System.out.println(a);
//		System.out.println(this.a);
		
		System.out.println(b);
//		System.out.println(this.b);
		System.out.println(Test.b);
	}
	
	// static 메서드 안에서는 static 메서드만 접근 가능
	// static 메서드 안에서는 this 사용 불가능
	public static void method3() {
//		method1();
		method2();
		
//		this.method1();
//		this.method2();
	}
	
	static {
		System.out.println("static 블록 영역입니다.");
		System.out.println("main 메서드보다 먼저 실행됩니다.");
	}
}

public class StaticVariableExam1 {
	public static void main(String[] args) {	
		System.out.println("main 메서드가 실행되었습니다.");
		
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
		System.out.println("t3 = " + t3);
		
		System.out.println("----- non static변수 -----");
		System.out.println("t1.a = "+ t1.a);
		System.out.println("t2.a = "+ t2.a);
		System.out.println("t3.a = "+ t3.a);
		
		System.out.println("----- static변수 -----");
//		System.out.println("t1.b = "+ t1.b);
//		System.out.println("t2.b = "+ t2.b);
//		System.out.println("t3.b = "+ t3.b);
		System.out.println("Test.b = "+ Test.b);
	}
}