package ex0729.conditional;

public class ifExam01 {
	public static void main(String[] args) {
		// 난수 함수를 이용해 랜덤한 정수를 받아온다.
		// Math.random() 함수는 0 ~ 1 double 값을 반환한다.
		// 정수값이 필요하므로 casting을 통해 int로 바꿔야 한다.
		int num = (int) (Math.random() * 56 + 45); 
		
		// 정수의 값이 짝수인지 홀수인지 판단해 출력한다.
		if (num % 7 == 0) {
			System.out.println(num + "은 7의 배수입니다.");
		} else {
			System.out.println(num + "은 7의 배수가 아닙니다.");
		}
	}
}