package e05_interface;

/**
 * 인터페이스를 구현하는 추상 클래스
 * - 인터페이스의 모든 추상 메서드를 구현하지 않아도 됨 (자식 클래스에게 위임)
 */
public abstract class SuperClass implements InterA {
	/**
	 * 인터페이스의 추상 메서드를 다시 추상 메서드로 선언하여 자식 클래스가 구현하도록 강제함
	 */
	public abstract void interA();
}
