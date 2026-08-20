package ex0807.equals;

class EqualsExam2 {
	String stringObject;

	public EqualsExam2(String s) {
		stringObject = s;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof EqualsExam2 eq2) {
			return this.stringObject.equals(eq2.stringObject);
		}
		return false;
	}
	
	public static void main(String args[]) {
		System.out.println("EqualsExam ee1 = new EqualsExam(\"Object.equals()\");");
		System.out.println("EqualsExam ee2 = new EqualsExam(\"Object.equals()\");");
		
		EqualsExam2 ee1 = new EqualsExam2("Object.equals()");
		EqualsExam2 ee2 = new EqualsExam2("Object.equals()");

		// Object의 equals() - 주소값 비교
		if (ee1.equals(ee2)) {
			System.out.println("ee1.equals(ee2) = true");
		} else {
			System.out.println("ee1.equals(ee2) = false");
		}

		// == 연산자 - 주소값 비교
		if (ee1 == ee2) {
			System.out.println("(ee1 == ee2) = true");
		} else {
			System.out.println("(ee1 == ee2) = false");
		}
		
		System.out.println();

		System.out.println("String s1 = \"new String Object1\";");
		System.out.println("String s2 = \"new String Object1\";");

		String s1 = "new String Object1";
		String s2 = "new String Object1";

		// String의 equals() - 문자열 비교
		if (s1.equals(s2)) {
			System.out.println("s1.equals(s2) = true");
		} else {
			System.out.println("s1.equals(s2) = false");
		}

		// == 연산자 - 주소값 비교
		if (s1 == s2) {
			System.out.println("(s1==s2) = true");
		} else {
			System.out.println("(s1==s2) = false");
		}
		
		System.out.println();

		System.out.println("String s3 = new String(\"new String Object2\");");
		System.out.println("String s4 = new String(\"new String Object2\");");

		String s3 = new String("new String Object2");
		String s4 = new String("new String Object2");

		// String의 equals() - 문자열 비교
		if (s3.equals(s4)) {
			System.out.println("s3.equals(s4) = true");
		} else {
			System.out.println("s3.equals(s4) = false");
		}

		// == 연산자 - 주소값 비교
		if (s3 == s4) {
			System.out.println("(s3==s4) = true");
		} else {
			System.out.println("(s3==s4) = false");
		}
		
		System.out.println();

		System.out.println("String s5 = new String(\"new String Object3\");");
		System.out.println("String s6 = \"new String Object3\";");
		System.out.println("String s7 = \"new String Object3\";");

		String s5 = new String("new String Object3");
		String s6 = "new String Object3";
		String s7 = "new String Object3";

		// String의 equals() - 문자열 비교
		if (s5.equals(s6)) {
			System.out.println("s5.equals(s6) = true");
		} else {
			System.out.println("s5.equals(s6) = false");
		}

		// == 연산자 - 주소값 비교
		if (s5 == s6) {
			System.out.println("(s5==s6) = true");
		} else {
			System.out.println("(s5==s6) = false");
		}

		// s6과 s7은 리터럴로 String Pool의 같은 위치 가리킴
		if (s6.equals(s7)) {
			System.out.println("s6.equals(s7) = true");
		} else {
			System.out.println("s6.equals(s7) = false");
		}

		if (s6 == s7) {
			System.out.println("(s6==s7) = true");
		} else {
			System.out.println("(s6==s7) = false");
		}
	}
}
