package ex0821;

class Test implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("자동으로 close() 호출!");
	}
}

public class AutoCloseableExam {
	public static void main(String[] args) {
		System.out.println("----- 시작 -----");
		
		try (Test t = new Test();){
			System.out.println(t);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("----- 종료 -----");
	}
}
