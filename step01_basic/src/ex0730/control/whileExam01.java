package ex0730.control;

public class whileExam01 {
	public static void main(String[] args) {
		//1. 1~ 100가지 한줄로 출력
        int num1 = 1;
		while(num1 <= 100) {
        	System.out.print((num1++) + " ");
        }
        System.out.println(); System.out.println();

		//2. A ~Z 까지 한줄로 출력
        char ch1 = 'A';
		while(ch1 <= 'Z') {
        	System.out.print((ch1++) + " ");
        }
        System.out.println(); System.out.println();

		//3. 1~ 10 까지  합 구해서 출력
        int sum = 0, num3 = 0;
		while(++num3 <= 10) {
        	sum += num3;
        }
        System.out.println(sum); System.out.println();

		//4. 1 ~ 100 사이의 7의 배수만 출력 
        int num4 = 0;
		while(++num4 <= 100) {
        	if (num4 % 7 ==0) System.out.print(num4 + " ");
        }
        System.out.println(); System.out.println(); 

		//5. 100 ~ 1 사이의 5 의 배수만 출력
        int num5 = 100;
        while (num5 >= 1) {
        	if (num5 % 5 == 0) System.out.print(num5+ " ");
        	num5--;
        }
        System.out.println(); System.out.println();

		//6.  1 ~ 100가지 10행 10열로 출력 (while 안에 while 이용)
        int i = 0;
        while (i < 10) {
        	int j= 1;
        	while (j <= 10) {
        		System.out.print((i * 10 + j++) + " ");
        	}
        	i++;
        	System.out.println();
        }
        System.out.println();
		
		//7. 1 ~ 100가지 10행 10열로 출력 (while 안에 if 이용)
        int num7 = 0;
        while (++num7 <= 100) {
        	System.out.print(num7 + " ");
        	if (num7 % 10 == 0) System.out.println();
        }
    	System.out.println();

		//8. 구구단 출력  -  while 안에 while 이용
        int col = 1;
        while (col <= 9) {
        	int row = 2;
        	while (row <= 9) {
        		System.out.print(row + "*" + col + "=" + (row * col)+ "  ");
        		row++;
        	}
        	col++;
        	System.out.println();
        }
	}
}