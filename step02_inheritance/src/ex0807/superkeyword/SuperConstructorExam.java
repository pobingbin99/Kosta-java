package ex0807.superkeyword;

class Parent {
	Parent() {
		System.out.println("기본 생성자");
	}
	Parent(int i) {
		System.out.println("정수를 전달받는 생성자");
	}
	Parent(String s) {
		System.out.println("문자열을 전달받는 생성자");
	}
}

class Child extends Parent {
	Child() {
		System.out.println("자식 기본 생성자");
	}
	Child(int i) {
		
		System.out.println("정수를 전달받는 자식 생성자");
	}
	Child(boolean b) {
		
		System.out.println("불린값을 전달받는 자식 생성자");
	}
}

public class SuperConstructorExam {
	public static void main(String[] args) {
		new Child(); System.out.println();
		new Child(1); System.out.println();
		new Child(true); 
	}
}