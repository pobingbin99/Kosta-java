package ex0813.exam05;

public class Course {
	/**
	 * 모든 사람을 등록 허용
	 */
	public void register01(Applicant<?> applicant) {
		System.out.println(applicant.getKind().getClass().getSimpleName() + " 신청완료(register01)");
	}
	
	/**
	 * 직장인만 등록 허용
	 */
	public void register02(Applicant<? super Worker> applicant) {
		System.out.println(applicant.getKind().getClass().getSimpleName() + " 신청완료(register02)");
	}
	
	/**
	 * 학생들만 등록 허용
	 */
	public void register03(Applicant<? extends Student> applicant) {
		System.out.println(applicant.getKind().getClass().getSimpleName() + " 신청완료(register03)");
	}
}