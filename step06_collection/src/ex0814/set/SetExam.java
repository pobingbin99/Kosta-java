package ex0814.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {
	Set<String> set = new TreeSet<String>(Collections.reverseOrder());
	 
	public SetExam(String[] args) {
		for (String str : args) {
			System.out.println(set.add(str));
		}
		System.out.println("추가 결과: " + set.toString());
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.printf("%s ", it.next());
		}
		
		/*
		 * 개선된 for 문은 내부적으로 Iterator 사용
		 */
		for (String str : set) {
			System.out.println(str);
		}
		
		System.out.println("----- 요소 제거하기 -----");
		System.out.println(set.remove("10"));
		System.out.println("제거 결과: " + set.toString());
	}
	
	public static void main(String[] args) {
		new SetExam(args);
	}
}