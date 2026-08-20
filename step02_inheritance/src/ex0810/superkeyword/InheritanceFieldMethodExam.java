package ex0810.superkeyword;

class Animal {
	int age = 5;
	String bodyColor;
	
	public void sound() {
		System.out.println("Animal sound()");
	}
	
	public void eat() {
		System.out.println("Animal eat()");
	}
}

class Cat extends Animal {
	int age = 10;
	int weight;
	
	@Override
	public void sound() {
		System.out.println("Cat sound()");
	}

	@Override
	public void eat() {
		System.out.println("Cat eat()");
	}
	
	public void run() {
		System.out.println("Cat run()");
	}
	
	public void test() {
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
		
		System.out.println(bodyColor);
		System.out.println(this.bodyColor);
		System.out.println(super.bodyColor);
		
		System.out.println(weight);
		System.out.println(this.weight);
//		System.out.println(super.weight);
	}
	
}

public class InheritanceFieldMethodExam {
	public static void main(String[] args) {
		// Cat 타입 객체
		Cat cat = new Cat();
		
		cat.sound();
		cat.eat();
		cat.run();
		
		cat.test();
		
		// Animal 타입 객체
		Animal animal = new Cat();
		
		animal.sound();
		animal.eat();
//		animal.run();
		
		// 다운캐스팅
		if (animal instanceof Cat castingCat) {
			castingCat.run();
		}
	}
}