package ex0804.array.student;

/**
 * 사용자 출력을 담당하는 클래스
 */
public class StudentEndView {
	/**
	 * 전체 학생의 정보 출력
	 */
	public static void printAll(Student[] stArr, int studentNum) {
		System.out.printf("총 학생 수: %d\n", studentNum);
		
		for (int i = 0; i < studentNum; i++) {
			printOne(stArr[i]);
		}
	}
		
	/**
	 * 특정 이름의 학생 정보 출력
	 */
	public static void printOne(Student st) {
		System.out.printf("이름: %s, 나이: %d, 주소: %s\n\n",
				st.getName(), st.getAge(), st.getAddr());
	}	
		
	/**
	 * 학생 등록 실패, 성공 여부 출력
	 */	
	public static void printMessage(String message) {
		System.out.printf("%s\n\n", message);
	}
}