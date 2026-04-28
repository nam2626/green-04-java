package e06_diamond;

/**
 * 최상위 인터페이스 A
 */
public interface A {
	public void methodA();
	
	/**
	 * 추상 메서드는 여러 단계에서 중복 선언되어도 최종 구현 단계에서 한 번만 구현하면 됨
	 */
	public void methodB();
	
	/**
	 * 디폴트 메서드
	 */
	default void method() {
		System.out.println("A의 디폴트 메서드");
	}
}
