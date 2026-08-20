package ex0812shopping;

public class NoKidsException extends Exception {
	private static final long serialVersionUID = 1L;
	private static int count = 0;

	NoKidsException() {
		count++;
	}
	
	NoKidsException(String message) {
		super(message);
		count++;
	}
	
	public static int getCount() {
		return count;
	}
}