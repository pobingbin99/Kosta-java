package ex0813.ch15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * ArrayList 걸린 시간:   7083700 ns 
 * LinkedList 걸린 시간:  1479500 ns 
 * 
 * LinkedList가 훨씬 빠른 성능을 낸다.
 * ArrayList는 0번 인덱스에 새로운 객체가 추가되면 기존 객체를 한 칸씩 뒤로 미는 작업을 한다.
 */
public class LinkedListExam {
	public static void main(String[] arg) {
		// ArrayList 컬렉션 객체 생성
		List<String> list1 = new ArrayList<String>();
		
		// LinkedList 컬렉션 객체 생성
		List<String> list2 = new LinkedList<String>();
		
		// 시작 시간과 끝 시간을 저장할 변수 선언
		long startTime;
		long endTime;
		
		// ArrayList 컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간: ", (endTime-startTime));
		
		// LinkedList 컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간: ", (endTime-startTime));
	}
}