package ex0805.constructor;

//ConstructorExam.java
class Puppy{
	//String, int 타입 전역 변수 선언(member 변수선언)
	private String str;
	private int num;
	
	/* 메소드 printPuppyName 작성
	 * 인수 없음, 리턴 안함
	 * "public void printPuppyName() 호출되었습니다!" 출력
	 * 전역 변수를 출력
	*/	
	public void printPuppyName() {
		System.out.println("public void printPuppyName() 호출되었습니다!");
		System.out.println("str: " + str);
		System.out.println("num: " + num);
	}
		
	/*
	 * 인수가 없는 생성자 작성
	 * "생성자 public Puppy() 호출되었습니다!"출력
	 * printPuppyName 메소드 호출
	 * 전역변수 String에 "메리" 할당
	 * 전역변수 int에 -98998 할당
	 */
	Puppy() {
		System.out.println("생성자 public Puppy() 호출되었습니다!");
		printPuppyName();
		str = "메리";
		num = -98998;
	}	
}
public class ConstructorExam{
	//메인 메소드에서
	public static void main(String [] agrs){
		//Puppy객체 생성
		Puppy p = new Puppy();
		 
		//Puppy객체의 printPuppyName 메소드 호출
		p.printPuppyName();
	}
}
			
