package ex0807.overriding;

class ObjectExam {
	private String str;
	
	public ObjectExam() {
		this.str = "";
	}

	public ObjectExam(String str) {
		this.str = str;
	}
	
	@Override
	public String toString() {
		return str;
	}
}

class ReferenceExam {
	public static void main(String[] args) {
		char c = 'a';
		
		String s01 = "장희정";
		String s02 = "Java";
		
		String s03 = new String("월요일");
		
		ObjectExam oe1 = new ObjectExam("집에가요");
		ObjectExam oe2 = new ObjectExam("안녕히계세요");
		
		System.out.println(c);
		
		System.out.println(s01);
		System.out.println(s02);
		
		System.out.println(s03);
		
		System.out.println(oe1);
		System.out.println(oe2); 
	}
}
