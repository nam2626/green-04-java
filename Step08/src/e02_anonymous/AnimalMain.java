package e02_anonymous;

/**
 * 익명 클래스(Anonymous Class) 예제
 * 클래스 정의와 객체 생성을 동시에 처리하는 이름 없는 클래스입니다.
 */
public class AnimalMain {
	
	/**
	 * Animal 타입을 매개변수로 받아 eat 메서드를 실행하는 공통 메서드
	 */
	public static void eat(Animal a) {
		a.eat();
	}
	
	public static void main(String[] args) {
		// 1. 추상 클래스 Animal을 상속받는 익명 클래스를 정의하고 객체를 생성합니다.
		Animal animal = new Animal() {
			
			@Override
			public void eat() {
				System.out.println("동물이 먹이를 먹습니다.");
			}
		};
		eat(animal);
		
		// 2. 메서드의 인자값으로 직접 익명 클래스를 정의하여 전달할 수 있습니다.
		eat(new Animal() {
			
			@Override
			public void eat() {
				System.out.println("사람이 밥을 먹습니다.");
			}
		});
	}

}
