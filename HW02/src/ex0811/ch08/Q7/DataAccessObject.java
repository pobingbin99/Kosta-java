package ex0811.ch08.Q7;

/*
 * 인터페이스에 메서드 선언시 자동 public abstract
 */
public interface DataAccessObject {
	void select();
	void insert();
	void update();
	void delete();
}