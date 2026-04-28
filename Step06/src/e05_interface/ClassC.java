package e05_interface;

/**
 * 추상 클래스를 상속받고 여러 인터페이스를 동시에 구현하는 클래스
 * - 클래스 상속은 하나만 가능(extends)하지만, 인터페이스 구현은 여러 개 가능(implements)함
 */
public class ClassC extends SuperClass implements InterA, InterB {

	/**
	 * InterB의 추상 메서드 구현
	 */
	@Override
	public void interB() {
		System.out.println("ClassC에서 구현된 interB 메서드");
	}

	/**
	 * SuperClass(또는 InterA, InterB)의 추상 메서드 구현
	 */
	@Override
	public void interA() {
		System.out.println("ClassC에서 구현된 interA 메서드");
	}

}
