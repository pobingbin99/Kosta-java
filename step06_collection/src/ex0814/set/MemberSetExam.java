package ex0814.set;

import java.util.HashSet;
import java.util.Set;

public class MemberSetExam {
	Set<Member> set = new HashSet<Member>();	
	
	// ctrl + alt + 다운
	public MemberSetExam() {
		set.add(new Member("사람1", 10, "서울"));
		set.add(new Member("사람2", 20, "대구"));
		set.add(new Member("사람3", 30, "대전"));
		
		System.out.println("저장된 객체의 수 = " + set.size());
	}
	
	public static void main(String[] args) {
		new MemberSetExam();
	}
}