package ex0812;

public class ExceptionExam {
	public static void main(String[] args) {
		System.out.println("------- Exception Test Start -------\n");
		
		System.out.println("args = " + args);
		
		try {
			System.out.println("args[0] = " + args[0]);
			
			int convertNum = Integer.parseInt(args[0]);
			System.out.println("convertNum = " + convertNum);
			
			int result = 100 / convertNum;
			System.out.println("result = " + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nException Message: " + e.getMessage());
			System.out.println("ArrayIndexOutOfBoundsException 예외 발생!");
		} catch (NumberFormatException e) {
			System.out.println("\nException Message: " + e.getMessage());
			System.out.println("NumberFormatException 예외 발생!");
		} catch (ArithmeticException e) {
			System.out.println("\nException Message: " + e.getMessage());
			System.out.println("ArithmeticException 예외 발생!");
		} catch (Exception e) {
			System.out.println("\nException Message: " + e.getMessage());
			System.out.println("Exception 예외 발생!");
			e.printStackTrace();
		} finally {
			System.out.println("No Exception~~~~~");
		}
		
		System.out.println("\n------- Exception Test End -------");
	}
}