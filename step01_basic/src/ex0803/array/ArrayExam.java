package ex0803.array;

class ArrayExam{
	//int, double, char, boolean, String
	//type 별로 총 5개씩 저장하는 배열을 생성하세요
	int[] arrInt = new int[5];
	double[] arrDouble = new double[5];
	char[] arrChar = new char[5];
	boolean[] arrBoolean = new boolean[5];
	String[] arrString = new String[5];

	//메소드 : printArrayValue01	
	//위의 배열들에 자동으로 초기화 된값을 출력하세요
	public void printArrayValue01() {
		for(int n: arrInt) {
			System.out.print(n + " ");
		} System.out.println();
		
		for(double d: arrDouble) {
			System.out.print(d + " ");
		} System.out.println();
		
		for(char c: arrChar) {
			System.out.print(c + " ");
		} System.out.println();
		
		for(boolean b: arrBoolean) {
			System.out.print(b + " ");
		} System.out.println();
		
		for(String s: arrString) {
			System.out.print(s + " ");
		} System.out.println();
	}

	//메소드 : printArrayValue02	
	//위의 5개의 배열에서 각각 적당한 값으로 data를 할당하세요
	public void printArrayValue02() {
		for (int i = 0; i < 5; i++) {
			arrInt[i] = i;
			arrDouble[i] = i * 2.0;
			arrChar[i] = (char)(i + 65);
			arrBoolean[i] = (i % 2 == 0) ? true : false;
			arrString[i] = "String" + i;
		}
	}
	
	//메소드 : printArrayValue03	
	//새롭게 할당된값을 출력하세요
	public void printArrayValue03() {
		printArrayValue01();
	}
	
	//메인메소드에서
	//ArrayExam의 메소드들을 순서대로 호출하세요.
	public static void main(String[] args) {
		ArrayExam ae = new ArrayExam();
		
		ae.printArrayValue01();
		ae.printArrayValue02();
		ae.printArrayValue03();
	}
}