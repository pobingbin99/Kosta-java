package WS_07_Exception.com.ws07.exception;

public class UserAccountNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public UserAccountNotFoundException(String message) {
		super(message);
	}
}