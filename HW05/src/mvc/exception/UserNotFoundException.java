package mvc.exception;

/**
 * 존재하지 않는 Profile일 때 발생하는 예외
 */
public class UserNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public UserNotFoundException() {
		super("존재하지 않는 사용자입니다.");
	}

	public UserNotFoundException(String message) {
		super(message);
	}
}