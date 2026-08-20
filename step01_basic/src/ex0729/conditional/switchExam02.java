package ex0729.conditional;

public class switchExam02 {

	public static void main(String[] args) {
		// 1 이상 12 이하의 랜덤한 정수 생성
		int month = (int)(Math.random() * 12 + 1);

		// 28일 or 30일 or 31일
		int days = 31;
		
		switch(month) {
			case 2: days = 28; break;
			case 4, 6, 9, 11: days = 30; break;
		}
		
		System.out.println(month + "월은 총 " + days + "일 입니다.");
	}
}