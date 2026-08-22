package mvc.view;

import mvc.dto.Profile;

public class SuccessView {
	public static void printWeight(Profile profile) {
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("\t" + profile.getName() + "님의 몸무게는 " + profile.getWeight() + " kg 입니다.");
		System.out.println("----------------------------------------");
		System.out.println();
	}
	
	public static void printPassword(Profile profile) {
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("\t" + profile.getName() + "님의 비밀번호는 " + profile.getPassword() + "  입니다.");
		System.out.println("----------------------------------------");
		System.out.println();
	}

	public static void printMessage(String message) {
		System.out.println("\n----- " + message + " -----\n");
	}
}