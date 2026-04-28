package e01_abstract;

public class AbstractMain {

	public static void main(String[] args) {
		//추상 클래스는 직접적인 생성이 되지 않음
//		Animal a = new Animal();
		Dog d = new Dog();
		d.run();
	}

}
