package ex0812shopping;

public class Shopping {
	public void checkAge(int age) throws NoKidsException {
		if (age > 18) System.out.println(age + "살님 입장하신걸 환영합니다.");
		else throw new NoKidsException("애들은 가라");
	}
}