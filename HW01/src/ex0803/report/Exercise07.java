package ex0803.report;

/**
 * @author 이은진
 * @since 2026-08-03
 */
public class Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		// 성능 이슈로 변수로 정의해 사용
		int len = array.length;
		
		// for 문 사용해 배열 길이만큼 반복
		for (int i = 0; i < len; i++) {
			if (max < array[i]) max = array[i];
		}
		
		System.out.println("max: " + max);
	}
}