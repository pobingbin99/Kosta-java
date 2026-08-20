package ex0813.list;

import java.util.ArrayList;
import java.util.Collections;

public class ListExam01 extends ArrayList<Integer> {
	private static final long serialVersionUID = 1L;

	public ListExam01() {
		// 생성
		super(5);
		
		// 추가
		super.add(10);
		super.add(70);
		super.add(50);
		super.add(20);
		super.add(80);
		
		super.add(90);
		super.add(30);
		super.add(40);
		super.add(60);
		
		// 개수
		System.out.println("저장된 객체의 개수: " + super.size());
		
		// 조회
		for (int i = 0; i < super.size(); i++) {
			System.out.printf("%d번 째 객체 값: %d\n", i, super.get(i));
		}
		
		// 개선된 for문
		for (Integer i: this) {
			System.out.printf("%d ", i);
		} System.out.println();
		
		// 제거
		System.out.println("제거 전 this = " + this.toString());
		super.remove(0);
		
		// 오버라이딩된 toString()
		System.out.println("제거 후 this = " + this.toString());
		
		// 정렬 - 오름차순
		Collections.sort(this);
		System.out.println("오름차순 정렬 this = " + this.toString());
		
		Collections.sort(this, Collections.reverseOrder());
		System.out.println("내림차순 정렬 this = " + this.toString());
	}
	
	public static void main(String[] args) {
		new ListExam01();
	}
}