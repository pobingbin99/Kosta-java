package ex0803.report;

import java.util.Scanner;

/**
 * @author 이은진
 * @since 2026-08-03
 */
public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
			} else if (selectNo == 2) {
				scores = new int[studentNum];
				for (int i = 0; i < studentNum; i++) {
					System.out.print("scores[" + i + "]" + "> ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
				
			} else if (selectNo == 4) {
				int max = 0, sum = 0;
				for (int i = 0; i < studentNum; i++) {
					if (max < scores[i]) max = scores[i];
					sum += scores[i];
				}
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + (int) (sum / 3.0 * 100) / 100.0);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		scanner.close();
		System.out.println("프로그램 종료");
	}
}