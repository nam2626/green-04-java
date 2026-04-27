package e03_inheritance;

public class AnimalMain {
	/**
	 * 다형성(Polymorphism)을 활용한 메서드
	 * Animal 타입의 매개변수는 Animal뿐만 아니라 그 자식 객체(Human 등)도 전달받을 수 있음
	 */
	public static void eat(Animal a) {
		// 전달된 실제 객체(인스턴스)의 오버라이딩된 메서드가 호출됨
		a.eat();
	}
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println("-----");
		Human human = new Human();
		System.out.println("-----");
		Dog dog = new Dog();
		System.out.println("-----");
		
		// 1. 일반적인 메서드 호출
		animal.eat();
		human.eat();
		dog.eat();
		
		System.out.println("--------------------");
		
		// 2. 다형성을 이용한 호출 (Upcasting)
		// 자식 객체는 부모 타입의 변수에 담길 수 있으며, 메서드 호출 시 자식의 기능이 실행됨
		eat(animal);
		eat(human);
	}

}
