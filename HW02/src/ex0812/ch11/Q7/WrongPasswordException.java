package ex0812.ch11.Q7;

public class WrongPasswordException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public WrongPasswordException() { }
	public WrongPasswordException(String message) {super(message);}
}