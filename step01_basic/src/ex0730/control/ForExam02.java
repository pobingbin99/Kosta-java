package ex0730.control;

public class ForExam02 {
	public static void main(String[] args) {
	    //1. 1 ~ 100까지 10행 10열로 출력 (for 안에 for 이용)
        for (int i = 0; i < 10; i++) {
        	for (int j = 1; j <= 10; j++) {
        		System.out.print((i * 10 + j) + " ");
        	}
        	System.out.println();
        }
        System.out.println();
        
	    //2. 1 ~ 100까지 10행 10열로 출력 (for 안에 if 이용)
        for (int i = 1; i <= 100; i++) {
        	System.out.print(i + " ");
        	if (i % 10 == 0) System.out.println();
        }
        System.out.println();
        
        //3. 구구단 출력  -  for 안에 for 이용
        for (int i = 1; i <= 9; i++) {
        	for (int j = 2; j <= 9; j++) {
        		System.out.print(j + "*" + i + "=" + (j * i) + " ");
        	}
        	System.out.println();
        }
	}
}