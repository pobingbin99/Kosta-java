package ex0812.exam02;

public class MainApp {
	public static void main(String[] args) {
		Product<TV, String> p1 = new Product<>();
		p1.setKind(new TV());
		p1.setModel("삼성TV");
		
		// The method setKind(TV) in the type Product<TV,String> is not applicable for the arguments (Vedio)
		// p1.setKind(new Vedio());
		
		Product<Vedio, Integer> p2 = new Product<>();
		p2.setKind(new Vedio());
		p2.setModel(100); // autoboxing
		int num = p2.getModel(); // unboxing
		System.out.println(num);
		
		// The method setKind(Vedio) in the type Product<Vedio,String> is not applicable for the arguments (TV)
		// p2.setKind(new TV());
	}
}