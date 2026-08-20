package ex0811.ch08.Q5;

/*
 * TV 클래스는 Remocon 인터페이스를 구현한다.
 * Remocon 인터페이스의 추상메서드 powerOn의 구현부를 작성한다.
 * new TV()와 같이 객체를 생성해 Remocon 타입에 담을 수 있다.
 */
public class TV implements Remocon {
	@Override
	public void powerOn() {
		System.out.println("TV를 켰습니다.");
	}
	
	public static void main(String[] args) {
		Remocon r = new TV();
		r.powerOn();
	}
}
