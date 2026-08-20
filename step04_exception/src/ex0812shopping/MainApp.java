package ex0812shopping;

import java.util.Random;

public class MainApp {
	public static void main(String[] args) throws NoKidsException {
		Shopping shopping = new Shopping();
		
		for (int i = 0; i < 10; i++) {
			Random random = new Random();
			try {
				shopping.checkAge(random.nextInt(55) + 1);
			} catch(NoKidsException e) {
				System.out.println("NoKidsException 예외 발생");
			}
		} 
		System.out.println("\nNoKidsException 발생 횟수: " + NoKidsException.getCount());
	}
}
