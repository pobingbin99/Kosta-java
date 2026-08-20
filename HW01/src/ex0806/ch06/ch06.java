package ex0806.ch06;

public class ch06 {
	// Q13), Q14)
	class Member {
		String name;
		String id;
		String password;
		int age;

		Member(String name, String id) {
			this.name = name;
			this.id = id;
		}
	}

	// Q15)
	class MemberService {
		boolean login(String id, String password) {
			if (id.equals("hong") && password.equals("1234")) {
				return true;
			} else {
				return false;
			}
		}

		void logout(String id) {
			System.out.println(id + "님이 로그아웃 되었습니다.");
		}
	}
	
	// Q16)
	class Printer {
		void println(int n) {
			System.out.println(n);
		}
		void println(boolean b) {
			System.out.println(b);
		}
		void println(double d) {
			System.out.println(d);
		}
		void println(String s) {
			System.out.println(s);
		}
	}
	
	// Q17)
	class Printer2 {
		static void println(int n) {
			System.out.println(n);
		}
		static void println(boolean b) {
			System.out.println(b);
		}
		static void println(double d) {
			System.out.println(d);
		}
		static void println(String s) {
			System.out.println(s);
		}
	}
	
	// Q18)
//	class ShopService {
//		private static ShopService shopService = new ShopService();
//		
//		private ShopService() {
//		}
//		
//		public static ShopService getInstance() {
//			return shopService;
//		}
//	}
	
	// Q19)
	class Account {
		static final int MIN_BALANCE = 0;
		static final int MAX_BALANCE = 1000000;
		
		private int balance = 0;
		
		public int getBalance() {
			return balance;
		}
		
		public void setBalance(int balance) {
			if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) 
				this.balance = balance;	
		}
	}

	public static void main(String[] args) {
		/**
		 * Q1) 정답 3번
		 * 하나의 클래스로 여러 개의 객체를 생성할 수 있다.
		 */
		
		/**
		 * Q2) 정답 4번
		 * 클래스 구성 멤버는 생성자, 필드, 메서드이다.
		 */
		
		/**
		 * Q3) 정답 4번
		 * 클래스는 필드와 메서드를 가질 수도 있다. (반드시X)
		 */

		/**
		 * Q4) 정답 3번
		 * 필드의 선언 위치는 생성자 위치와 상관 없다.
		 * 클래스 블록 안에서 자유롭게 선언할 수 있다.
		 */
		
		/**
		 * Q5) 정답 1번
		 * 생성자 호출해야 객체를 생성할 수 있다.
		 * String s = "hello";은 예외적인 케이스
		 */
		
		/**
		 * Q6) 정답 4번
		 * 메서드 오버로딩을 통해 이름이 같은 메서드를 여러 개 정의할 수 있다.
		 */
		
		/**
		 * Q7) 정답 2번
		 * 메서드 오버로딩시 리턴 타입이 반드시 다를 필요는 없다.
		 * 매개변수의 타입, 수, 순서만 다르면 오버로딩 조건을 만족한다.
		 */
		
		/**
		 * Q8) 정답 2번
		 * 정적 블록은 클래스 로딩시 딱 한 번 실행되는 블록이므로
		 * 객체의 인스턴스 필드를 초기화할 수 없다.
		 */
		
		/**
		 * Q9) 정답 2번
		 * 상수는 객체 생성 없이고 클래스명으로 통해 접근 가능해야 한다.
		 * 따라서 선언과 동시에 초기화하거나 정적 블록에서 초기화해야 한다.
		 */
		
		/**
		 * Q10) 정답 4번
		 * 패키지를 이동할 경우 동작하지 않을 수 있다.
		 */
		
		/**
		 * Q11) 정답 3번
		 * 해당 클래스 내부에서만 사용 가능한 접근 제한자는 private이다.
		 */
		
		/**
		 * Q12) 정답 필드, 생성자, 메서드
		 */
	}
}