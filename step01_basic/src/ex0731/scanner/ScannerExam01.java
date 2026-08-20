package ex0731.scanner;

import java.util.Scanner;

public class ScannerExam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어> ");
		int kor = sc.nextInt();
		
		System.out.print("영어> ");
		int eng = sc.nextInt();
		
		// 이름을 입력받지 못하는 문제
		System.out.print("이름> ");
		String name = sc.nextLine();
		
		System.out.println(name + "님의 성적");
		System.out.println("국어: " + kor + ", 영어: " + eng);
	}
}