package e04_interface;

/**
 * Eat 인터페이스를 구현한 Employee 클래스
 */
public class Employee implements Eat {

	@Override
	public void eat() {
		System.out.println("직원이 점심을 먹습니다.");
	}

}
