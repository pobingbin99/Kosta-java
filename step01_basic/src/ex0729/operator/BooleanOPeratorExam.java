package ex0729.operator;

class BooleanOPeratorExam {
	public static void main(String args[]) {
		boolean t = true ;
		boolean f = false;
		
		// 양쪽이 true 일 때만 true
		System.out.println("true&false=" + (t&f));
		System.out.println("true&true=" + (t&t));
		System.out.println("false&false=" + (f&f));
		System.out.println();
	
		// 양쪽이 false 일 때만 false
		System.out.println("true|false=" + (t|f));
		System.out.println("true|true=" + (t|t));
		System.out.println("false|false=" + (f|f));
		System.out.println();

		// 두 값이 다르면 true, 같으면 false
		System.out.println("true^false=" + (t^f)); 
		System.out.println("true^true=" + (t^t));
		System.out.println("true^false=" + (t^f));
		System.out.println("true^true=" + (t^t));
		System.out.println();

		// 양쪽이 true 일 때만 true
		System.out.println("true&&false=" + (t&&f));
		System.out.println("true&&true=" + (t&&t));
		System.out.println("true&&false=" + (t&&f));
		System.out.println("false&&false=" + (f&&f));
		System.out.println();

		// 양쪽이 false 일 때만 false
		System.out.println("true||false=" + (t||f));
		System.out.println("true||true=" + (t||t));
		System.out.println("false||false=" + (f||f));
		System.out.println();

		int i=5; int j=3;
		System.out.println("int i=" + i + "\tint j=" + j);
		
		System.out.println("i>=j==>>" + (i>=j));
		System.out.println("i>j=>>" + (i>j));
		System.out.println("i<=j=>>" + (i<=j));
		System.out.println("i<j=>>" + (i<j));
		System.out.println("i==j=>>" + (i==j));
		System.out.println("i!=j=>>" + (i != j));
	}
}