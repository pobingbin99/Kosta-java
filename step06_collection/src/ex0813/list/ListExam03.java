package ex0813.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExam03 extends ArrayList<Emp> {
	private static final long serialVersionUID = 1L;

	public ListExam03() {
		// 사원 저장
		super.add(new Emp(1001, "희정", 20, "서울"));
		super.add(new Emp(1003, "나영", 18, "대구"));
		super.add(new Emp(1004, "미미", 25, "대전"));
		super.add(new Emp(1005, "삼순", 30, "서울"));
		super.add(new Emp(1002, "순돌", 23, "부산"));
	}
	
	/**
	 * 저장된 모든 사원의 정보 조회
	 */
	public List<Emp> selectAll() {
		return this;
	}
	
	/**
	 * eno에 해당하는 사원 정보 조회
	 * @Param 사원 번호 eno - int
	 * @Retrn 해당 직원이 존재하면 Emp 객체를 반환, 없으면 null 반환
	 */
	public Emp selectByEno(int eno) {
		for (Emp emp : this) {
			if (emp.getEno() == eno) return emp;
		}
		return null;
	}
	
	/**
	 * addr에 해당하는 사원 정보 조회
	 * @Param 사원 주소 addr = String
	 * @Return 해당하는 직원들의 List<Emp> 반환, 없으면 null 반환
	 */
	public List<Emp> selectByAddr(String addr) {
		List<Emp> result = new ArrayList<>();
		
		for (Emp emp : this) {
			if (emp.getAddr().equals(addr)) {
				result.add(emp);
			}
		}
		
		if(!result.isEmpty()) return result;
		else return null;
	}
	
	/**
	 * eno 기준으로 오름차순 정렬 - Comparable 이용
	 * @Return 정렬한 복사본 List<Emp> 반환
	 */
	public List<Emp> sortByEno() {
		List<Emp> result = new ArrayList<>(this);

		Collections.sort(result);

		return result;
	}
	
	/**
	 * age 기준으로 오름차순 정렬 - Comparator 이용
	 * @Return 정렬한 복사본 List<Emp> 반환
	 */
	public List<Emp> sortByEname() {
		List<Emp> result = new ArrayList<>(this);
		
	    Collections.sort(result, (emp1, emp2) ->
	        emp1.getAge() - (emp2.getAge()));
	    
	    return result;
	}
	
	public static void main(String[] args) {
		ListExam03 ex = new ListExam03();
		
		// eno 조회
		System.out.println("사원번호로 조회: 1001");
		System.out.println(ex.selectByEno(1001));
		
		// addr 조회
		System.out.println("주소로 조회: 서울");
		System.out.println(ex.selectByAddr("서울"));
		
		// eno 기준 정렬
		System.out.println("사원번호 기준 오름차순 정렬");
		List<Emp> sortedList = ex.sortByEno();
		System.out.println(sortedList);
		
		// age 기준 정렬
		System.out.println("나이 기준 오름차순 정렬");
		sortedList = ex.sortByEname();
		System.out.println(sortedList);
	}
}