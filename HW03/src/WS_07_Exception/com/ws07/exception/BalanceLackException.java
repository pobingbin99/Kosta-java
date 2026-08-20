package WS_07_Exception.com.ws07.exception;

public class BalanceLackException extends Exception {
	private static final long serialVersionUID = 1L;

	public BalanceLackException(String message) {
		super(message);
	}
}