package e04_interface;

/**
 * Eat 인터페이스를 구현한 Person 클래스
 */
public class Person implements Eat {

	@Override
	public void eat() {
		System.out.println("사람이 밥을 먹습니다.");
	}

}
