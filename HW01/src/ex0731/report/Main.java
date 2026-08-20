package ex0731.report;

import java.util.Scanner;

/**
 * @author 이은진
 * @since 2026-07-31
 */

class GradeCalculator {
	/** 
	 * @param kor
	 * @param eng
	 * @param math
	 * @return 국어, 영어, 수학 점수를 인수받아 총점을 구하여 리턴
	 */
	private int calSum(int kor, int eng, int math) {
		return kor + eng + math;
	}

	/**
	 * @param sum
	 * @param size
	 * @return 총점과 과목수를 인수로 받아 평균을 구하여 리턴
	 */
	private double calAvg(int sum, int size) {
		return (int) (sum / 3.0 * 100) / 100.0;
	}

	/**
	 * @param avg
	 * @return 평균을 인수로 받아 등급을 구하여 리턴
	 */
	private char calGrade(double avg) {
		return switch ((int)avg / 10) {
		    case 10, 9 -> 'A';
		    case 8 -> 'B';
		    case 7 -> 'C';
		    case 6 -> 'D';
		    default -> 'F';
		};
	}
	
	/**
	 * @param name
	 * @param kor
	 * @param eng
	 * @param math
	 */
	public void getGrade(String name, int kor, int eng, int math) {
		int sum = this.calSum(kor, eng, math);
		double avg = this.calAvg(sum, 3);
		char grade = this.calGrade(avg);
		
		System.out.println(name + "님의 성적)");
		System.out.println("국어: " + kor + ", 영어: " + eng + ", 수학: " + math);
		System.out.println("총점: " + sum + ", 평균: " + avg + ", 등급: " + grade);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GradeCalculator gc = new GradeCalculator();
		
		outer:
		while(true) {
			//메뉴를 출력하고 메뉴 선택(1.성적표구하기, 2. 종료) 
	        //메뉴에 따라 성적을 구하거나 프로그램을 종료
			System.out.println("-----------------------");
			System.out.println("1. 성적표구하기 | 2. 종료");
			System.out.println("-----------------------");
			
			System.out.print("선택> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
				case 1: {
					//이름, 국어,영어,수학 점수를 키보드로 입력받는다.
					System.out.print("이름> ");
					String name = sc.nextLine();
					
					System.out.print("국어> ");
					int kor = Integer.parseInt(sc.nextLine());
					System.out.print("영어> ");
					
					int eng = Integer.parseInt(sc.nextLine());
					System.out.print("수학> ");
					
					int math = Integer.parseInt(sc.nextLine());
					gc.getGrade(name, kor, eng, math);
					
					break;
				}
				case 2: {
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					break outer;
				}
				default: {
					System.out.println("메뉴를 다시 선택해주세요.");
				}
			}
		}
	}
}