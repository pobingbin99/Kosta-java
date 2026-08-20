package ex0730.scanner;

import java.util.Scanner;

public class ScannerExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요: ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요: ");
		int eng = sc.nextInt();
		
		System.out.println("국어 점수: " + kor);
		System.out.println("영어 점수: " + eng);
		
		sc.close();
	}
}