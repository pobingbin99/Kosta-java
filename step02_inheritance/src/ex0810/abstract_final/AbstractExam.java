package ex0810.abstract_final;

abstract class Animal {
	int legs;
	
	public abstract void sound();
}

class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("미야옹");
	}
}

class Pig extends Animal {
	@Override
	public void sound() {
		System.out.println("삼겹살");
	}
}

public class AbstractExam {
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal pig = new Pig();
		
		cat.sound();
		pig.sound();
	}

}