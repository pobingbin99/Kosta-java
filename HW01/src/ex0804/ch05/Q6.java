package ex0804.ch05;

/* 정답 3, 5
 * array.length는 이중 배열의 행 수로 3이다.
 * array[2].length는 이중 배열의 3번 째 행의 열 수로 5이다.
 */
public class Q6 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		System.out.println(array.length);
		System.out.println(array[2].length);
	}
}