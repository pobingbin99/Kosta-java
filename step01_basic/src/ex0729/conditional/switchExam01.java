package ex0729.conditional;

public class switchExam01 {

	public static void main(String[] args) {
		// 1 이상 12 이하의 랜덤한 정수 생성
		int num = (int)(Math.random() * 12 + 1);
		
		// 7 이상 12 이하의 경우 "토요일"
		String day = "토";
		
		switch(num) {
			case 1: day = "일"; break;
			case 2: day = "월"; break;
			case 3: day = "화"; break;
			case 4: day = "수"; break;
			case 5: day = "목"; break;
			case 6: day = "금"; break;
			default: day = "토";
		}
		
		System.out.println(day + "요일입니다.");	
	}
}