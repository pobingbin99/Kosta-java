package ex0804.ch05;

/* 
 * 이중 배열의 전체 합을 구하기 위해서는 이중 for문을 사용해야 한다.
 */
public class Q8 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0, size = 0;
		for (int[] row: array) {
			for (int num: row) {
				sum += num;
				size++;
			}
		}
		
		System.out.println("총합: " + sum);
		System.out.printf("평균: %.2f", (double)sum/size);
	}
}
