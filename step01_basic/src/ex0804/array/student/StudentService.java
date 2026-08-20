package ex0804.array.student;

/**
 * 학생의 정보를 관리 하는 서비스(등록, 수정, 검색 ....)
**/
public class StudentService {
	private Student[] studentArr = new Student[5];
	private int studentNum = 0;
	
	public int getStudentNum() {
		return studentNum;
	}
	
	/**
	 * 초기 데이터 3명 정도 세팅하기 
	 **/
	public void init(String[][] data) {
		for (int i = 0; i < data.length; i++) {
			studentArr[studentNum++] = createStudent(data[i]);
		}
	}
	
	/**
	 * Student 객체를 생성해서 리턴해주는 메소드 작성
	 **/
	private Student createStudent(String[] studentData) {
		Student st = new Student();
		
		st.setName(studentData[0]);
		st.setAge(Integer.parseInt(studentData[1]));
		st.setAddr(studentData[2]);
		
		return st;
	}

	/**
	 * 학생의 정보 등록하기 
	 * 배열의 경계를 벗어나면 더 이상 추가 불가능
	 * 학생 이름이 중복이면 등록 불가능
	 * 추가할 배열 공간이 남아있을 경우 추가
	 * @return : -1 추가 불가능, 0 중복, 1 성공
	 **/
	public int insert(Student s) {
		if (studentNum >= studentArr.length) return -1;
		if (selectByName(s.getName()) != null) return 0;
		studentArr[studentNum++] = s; return 1;
	}
	
	/**
	 * 전체 학생의 정보 조회하고 Student[] 리턴
	 **/
	public Student[] selectAll() {
		return studentArr;
	}
	 
	/**
	 * 이름에 해당하는 학생의 정보 검색하기
	 * 이름에 해당하는 학생이 있으면 Student 리턴
	 * 이름에 해당하는 학생이 없으면 null 리턴
	 * @return Student
	 **/
	public Student selectByName(String name) {
		for (int i = 0; i < studentNum; i++) {
			if (studentArr[i].getName().equals(name)) {
				return studentArr[i];
			}
		}
		return null;
	}
	
	/**
	 * 이름에 해당하는 학생의 나이와 주소 변경하기 
	 * 해당하는 학생이 있고, 수정에 성공했으면  true 리턴
	 * 해당하는 학생이 없거나, 수정에 실패했으면 false 리턴
	 * @param : Student
	 * @return : true 수정 성공, false 수정 실패
	 **/
	public boolean update(Student s) {
		Student findStudent = selectByName(s.getName());
		if (findStudent == null) return false;
		else {
			findStudent.setAge(s.getAge());
			findStudent.setAddr(s.getAddr());
			return true;
		}
	}
}