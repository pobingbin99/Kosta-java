package ex0731.report;

/**
 * @author 이은진
 * @since 2026-07-31
 */

class UsingMethodExam {
     /*
      * Method 이름 :  methodExam03_01
      * 자기자신만 접근가능
      * ReturnType : 정수
      * Parameter : 정수 1개
      * (구현부에서)하는 일 : 
      * methodExam03_01이 호출되었습니다. 출력
      * 인수로 받은 정수 출력 
      * 정수*2 리턴.
      */
	private int methodExam03_01(int num) {
		System.out.println("methodExam03_01이 호출되었습니다.");
		System.out.println("전달 받은 정수: " + num);
		return 2 * num;
	}

	 /*
	  * Method 이름 :  methodExam03_02
	  * 어디서나 아무나 접근가능
	  * Return String
	  * Parameter : String 1개, 정수 1개
	  * (구현부에서)하는 일 : 
	  * methodExam03_02가 호출되었습니다. 출력
	  * 인수로 받은 String 에 바보를 붙여서 출력
	  * 두번째인수로 들어온 값을 methodExam03_01로 넣어
	  * methodExam03_01을 호출하고 리턴하는 값을 출력
	  * 인수로 받은 String 에 바보를 붙여서 리턴
	  */	
	public String methodExam03_02(String str, int num) {
		System.out.println("methodExam03_02가 호출되었습니다.");
		System.out.println(str + "바보");
		System.out.println(this.methodExam03_01(num));
		return str + "바보";
	}
	
	 /*
	  * Method 이름 :  methodExam03_03
	  * 같은 package 에서 아무나 접근 가능
	  * ReturnType : 리턴안함
	  * Parameter : 정수 1개와 String 1개
	  * (구현부에서)하는 일 : 
	  * methodExam03_03이 호출되었습니다. 출력
	  * 인수로 받은 정수 1개와 String 1개를 넘겨주며
	  * methodExam03_02호출
	  */
	void methodExam03_03(int n, String str) {
		System.out.println("methodExam03_03이 호출되었습니다.");
		this.methodExam03_02(str, n);
	}
     
     /*
      * Method 이름 :  methodExam03_04
      * 상속관계라면 어디서나 접근 가능
      * ReturnType : 실수(부동소수형)
      * Parameter : 첫번째 인수(정수),두번째 인수(실수), 세번째인수(정수)
      * (구현부에서)하는 일 : 
      * methodExam03_04가 호출되었습니다. 출력
      * 인수로 들어온 값을 이용해 
      * MakeMethodExam02객체의 methodExam02_04메소드 호출하고
      * method02_04가 리턴하는 값을 리턴
      */	
	protected double methodExam03_04(int n1, double d, int n2) {
		System.out.println("methodExam03_04가 호출되었습니다.");
		MakeMethodExam02 mme2 = new MakeMethodExam02();
		return mme2.methodExam02_04(n1, d, n2);
	}
}

class UsingMethod{
	// 메인메소드에서
	public static void main(String[] args) {
		//UsingMethod 타입의 객체 생성
		UsingMethodExam ume = new UsingMethodExam();
		
		//UsingMethodExam은 private 타입이므로
		//다른 클래스에서는 호출할 수 없음
		//ume.methodExam01_01(10);
		
		//UsingMethodExam의 methodExam03_02 메서드 호출하고
		String r2 = ume.methodExam03_02("이은진", 10);
		
		//리턴하는 값 있다면 출력
		System.out.println(r2);
		
		//UsingMethodExam의 methodExam03_03 메서드 호출
		ume.methodExam03_03(20, "은진");
		
		//UsingMethodExam의 methodExam03_04 메서드 호출하고
		double r4 = ume.methodExam03_04(1, 10.0, 5);
		
		//리턴하는 값 있다면 출력
		System.out.println(r4);
	}
}