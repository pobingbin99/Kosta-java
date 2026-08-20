package ex0804.array;

class MultiArray {
	//정수형 2차원 배열 8 * 9
	int[][] arr = new int[8][9];
	
	//메소드이름: array99
	//for loop를 사용하여 
	//배열에 곱한 (구구단) 저장
	//배열에 결과를 꺼내 출력
	public void array99() {
		int row = arr.length;
		int col = arr[0].length;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = (i + 2) * (j + 1);
			}
		}
		
		for (int[] array: arr) {
			for (int num: array) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
	}
}
public class MemoryApart{
	public static void main(String[] srgs ) {
		//main메소드에서 MultiArray객체의 array99메소드호출
		MultiArray ma = new MultiArray();
		ma.array99();
	}
}