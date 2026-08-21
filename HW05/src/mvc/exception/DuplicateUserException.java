package mvc.exception;

/**
 * Profile 이름이 중복되었을 때 발생하는 예외
 */
public class DuplicateUserException extends Exception {
	private static final long serialVersionUID = 1L;

	public DuplicateUserException() {
		super("이미 존재하는 사용자입니다.");
	}

	public DuplicateUserException(String message) {
		super(message);
	}
}