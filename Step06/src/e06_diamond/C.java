package e06_diamond;

/**
 * A를 상속받는 인터페이스 C
 */
public interface C extends A {
	public void methodC();
	
	/**
	 * B와 동일한 이름의 디폴트 메서드를 정의함
	 */
	default void method1() {
		System.out.println("C의 디폴트 메서드");
	}
}
