package ex0730.ch04;

public class Q2 {
	public static void main(String[] args) {
		String grade = "B";

		int score1 = switch (grade) {
			case "A" -> 100;
			case "B" -> (100-20);
			default -> 60;
		};

		System.out.println(score1);
	}
}