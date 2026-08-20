package ex0730.control;

public class whileExam2 {
	public static void main(String[] args) {

		//1. 1~100까지 한 줄로 출력
		int num1 = 1;
		do {
			System.out.print(num1 + " ");
		} while (++num1 <= 100);
		System.out.println();
		System.out.println();

		//2. A~Z까지 한 줄로 출력
		char ch1 = 'A';
		do {
			System.out.print(ch1 + " ");
		} while (ch1++ <= 'Z');
		System.out.println();
		System.out.println();

		//3. 1~10까지 합 구해서 출력
		int sum = 0;
		int num3 = 1;
		do {
			sum += num3;
		} while (++num3 <= 10);
		System.out.println(sum);
		System.out.println();

		//4. 1~100 사이의 7의 배수만 출력
		int num4 = 1;
		do {
			if (num4 % 7 == 0)
				System.out.print(num4 + " ");
		} while (++num4 <= 100);
		System.out.println();
		System.out.println();

		//5. 100~1 사이의 5의 배수만 출력
		int num5 = 100;
		do {
			if (num5 % 5 == 0)
				System.out.print(num5 + " ");
		} while (--num5 >= 1);
		System.out.println();
		System.out.println();

		//6. 1~100까지 10행 10열 출력 (do-while 안에 do-while)
		int i = 0;
		do {
			int j = 1;
			do {
				System.out.print((i * 10 + j) + " ");
			} while (++j <= 10);
			System.out.println();
		} while (++i < 10);
		System.out.println();

		//7. 1~100까지 10행 10열 출력 (do-while 안에 if)
		int num7 = 1;
		do {
			System.out.print(num7 + " ");
			if (num7 % 10 == 0) System.out.println();
		} while (++num7 <= 100);
		System.out.println();

		//8. 구구단 출력 (do-while 안에 do-while)
		int col = 1;
		do {
			int row = 2;
			do {
				System.out.print(row + "*" + col + "=" + (row * col) + "  ");
			} while (++row <= 9);
			System.out.println();
		} while (++col <= 9);
	}
}