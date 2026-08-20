package ex0803.overloading;

public class VariavleArgsExam01 {
	public void aa(int... nums) {
		for (int num: nums) {
			System.out.println("num = " + num);	
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		VariavleArgsExam01 ve = new VariavleArgsExam01();
		
		ve.aa(1);
		ve.aa(1, 2);
		ve.aa(1, 2, 3);
	}
}