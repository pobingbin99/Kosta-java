package ex0729.conditional;

public class switchExam03 {

	public static void main(String[] args) {
		// 1 이상 12 이하의 랜덤한 정수 생성
		int month = (int)(Math.random() * 12 + 1);
		
		int days = switch(month) {
			case 2 -> 28;
			case 4, 6, 9, 11 -> 30;
			case 1, 3, 5, 7, 8, 10, 12 -> 31;
			default -> 0;
		};
		
		System.out.println(month + "월은 총 " + days + "일 입니다.");
		
		int ifDays = 31;
		
		if (month == 2) {
			ifDays = 28;
		} else if (month == 4 || month == 6 ||  month == 9 ||  month == 11) {
			ifDays = 30;
		}
		
		System.out.println(month + "월은 총 " + ifDays + "일 입니다.");
	}
}