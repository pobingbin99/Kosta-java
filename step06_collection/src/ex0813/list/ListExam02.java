package ex0813.list;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ListExam02 {
	// 인터페이스의 장점 - 교체가 쉬움
	// List<Integer> list = new LinkedList<>(5);
	// List<Integer> list = new ArrayList<>(5);
	List<Integer> list = new Vector<>(5);
	
	public ListExam02() {
		list.add(10);
		list.add(70);
		list.add(50);
		list.add(20);
		list.add(80);
		
		list.add(90);
		list.add(30);
		list.add(40);
		list.add(60);
		
		System.out.println("저장된 객체의 개수: " + list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d번 째 객체 값: %d\n", i, list.get(i));
		}
		
		for (Integer i: list) {
			System.out.printf("%d ", i);
		} System.out.println();
		
		System.out.println("제거 전 this = " + list.toString());
		list.remove(0);
		
		System.out.println("제거 후 this = " + list.toString());
		
		Collections.sort(list);
		System.out.println("오름차순 정렬 this = " + list.toString());
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("내림차순 정렬 this = " + list.toString());
	}
	
	public static void main(String[] args) {
		new ListExam02();
	}
}