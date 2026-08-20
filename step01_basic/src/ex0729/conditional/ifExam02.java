package ex0729.conditional;

public class ifExam02 {
	public static void main(String[] args) {
		// 1 이상 12 이하의 랜덤한 정수 생성
		int num = (int)(Math.random() * 12 + 1);
		
		// 7 이상 12 이하의 경우 "토요일"
		String day = "토";
		
		if (num == 1) day = "일";
		else if (num == 2) day = "화";
		else if (num == 3) day = "수";
		else if (num ==4) day = "목";
		else if (num == 5) day = "금";
		else if (num == 6) day = "토";
		
		System.out.println(day + "요일입니다.");	
	}
}