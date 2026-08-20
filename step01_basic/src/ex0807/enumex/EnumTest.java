package ex0807.enumex;

public class EnumTest {
	public static void main(String[] args) {
		Grade g = Grade.BASIC;
		
		switch(g) {
		case BASIC:
			System.out.println("일반고객");
			break;
		case SILVER:
			System.out.println("실버고객");
		case GOLD:
			System.out.println("골드고객");
		}
		
		System.out.println(g.getKind());
		System.out.println(g.getPoint());
		System.out.println(g.getRole());
	}
}