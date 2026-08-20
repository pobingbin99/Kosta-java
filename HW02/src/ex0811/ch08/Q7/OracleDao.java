package ex0811.ch08.Q7;

/*
 * DataAccessObject 인터페이스의 추상 메서드 구현
 */
public class OracleDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB에 삽입");
	}

	@Override
	public void update() {
		System.out.println("Oracle DB를 수정");
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
	}
}