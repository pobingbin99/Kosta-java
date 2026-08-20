package ex0804.array.student;

public class StudentTest {
	public static void main(String[] args) {
		//Student 초기 데이터
		String[][] data = {
				{"김땡떙", "20", "대구"},
				{"이땡땡", "25", "서울"},
				{"박땡떙", "30", "제주도"}
		};
		
		System.out.println("****** 학생 관리 프로그램 시작합니다.******");
		
		//StudentService의 전역변수들이 초기화 
		StudentService service = new StudentService();
		
		// 초기데이터 세팅
		service.init(data);
		
		//전체 학생 정보 출력
		StudentEndView.printAll(service.selectAll(), service.getStudentNum());
		
		//새로운 학생 등록하기
		System.out.println("--1. 등록하기 -----");
		
		Student student = new Student();
		student.setName("미미");
		student.setAge(25);
		student.setAddr("오리역");
		
		int result = service.insert(student);
		switch (result) {
			case -1 -> StudentEndView.printMessage("공간이 부족합니다.");
			case 0 -> StudentEndView.printMessage("이름이 중복됩니다.");
			case 1 -> StudentEndView.printMessage("추가에 성공했습니다.");
		}
		
		//전체 학생 정보 출력
		System.out.println("--2. 전체검색 -----");
		StudentEndView.printAll(service.selectAll(), service.getStudentNum());
		
		//이름으로 검색하기
		System.out.println("--3. 이름으로 검색 -----");
		Student resultStudent = service.selectByName("미미");
		if (resultStudent != null) StudentEndView.printOne(resultStudent);
		else StudentEndView.printMessage("존재하지 않는 이름입니다.");
		
		System.out.println("----- 이름이 없는경우 -----");
		resultStudent = service.selectByName("삼순이");
		if (resultStudent != null) StudentEndView.printOne(resultStudent);
		else StudentEndView.printMessage("존재하지 않는 이름입니다.");
		
		//수정하기 
		System.out.println("--4. 수정하기 -----");
		
		Student st2 = new Student();
		st2.setName("미미");
		st2.setAge(23);
		st2.setAddr("대전");

		if (service.update(st2)) {
			StudentEndView.printMessage("학생 정보 수정이 완료되었습니다.");
		} else {
			StudentEndView.printMessage("해당하는 학생이 존재하지 않습니다.");
		}
		
		System.out.println("----- 이름이 없는경우 -----");
		Student st3 = new Student();
		st2.setName("삼순이");
		st2.setAge(23);
		st2.setAddr("대전");
		
		if (service.update(st3)) {
			StudentEndView.printMessage("학생 정보 수정이 완료되었습니다.");
		} else {
			StudentEndView.printMessage("해당하는 학생이 존재하지 않습니다.");
		}
		
		System.out.println("----- 변경후 -----");
		StudentEndView.printAll(service.selectAll(), service.getStudentNum());
	}
}