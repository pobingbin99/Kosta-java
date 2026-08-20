package ex0804.ch05;

import java.util.Arrays;

/* 정답 3번
 * boolean 타입 배열의 기본 초기값은 false이다.
 * 아래 코드 실행시 false로 채워진 배열이 출력된다.
 */
public class Q5 {
	public static void main(String[] args) {
		boolean[] boolArr = new boolean[3];
		System.out.println(Arrays.toString(boolArr));
	}
}