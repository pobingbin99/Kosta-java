package ex0811.ch08.Q6;

/*
 * Soundable 인터페이스의 추상 메서드 sound()를 재정의한 구현 클래스
 */
public class Dog implements Soundable {
	@Override
	public String sound() {
		return "멍멍";
	}
}