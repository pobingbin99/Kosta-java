package ex0731.method;

/**
 * @author 이은진
 * @since 2026-07-31
 */

class Methodinvoke01{
	/*
	 * method 이름 : method01
	 * 어디서나 누구나 접근가능
	 * 정수 리턴
	 * 인수로 정수2개 받음
	 * 인수로 들어온 정수 2개를 곱해서 출력하고 리턴
	 */
	public int method01(int n1, int n2) {
		System.out.println(n1 + " X " + n2 + " = " + (n1 * n2));
		return n1 * n2;
	}
}

class Methodinvoke02{
	/*
	 * method 이름 : method02
	 * 어디서나 누구나 접근가능,객체를 생성하지 않고도 접근가능
	 * 정수 리턴
	 * 인수로 정수2개 받음
	 * 인수로 들어온 정수 2개를 더해서 출력하고 더한수 리턴
	 */
	static int method02(int n1, int n2) {
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		return n1 + n2;
	}
}

public class MethodInvokeExam{
	public static void main(String []args){
		//MethodInvoke01 타입의 객체 생성 - 일반적
		Methodinvoke01 mi01 = new Methodinvoke01();
		
		//MethodInvoke01의 method01 호출
		int r1 = mi01.method01(10, 20);
		System.out.println(r1);

		//MethodInvoke02의 method02 호출 - static
		int r2 = Methodinvoke02.method02(10, 20);
		System.out.println(r2);
	}
}