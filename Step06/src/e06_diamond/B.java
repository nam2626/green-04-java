package e06_diamond;

/**
 * A를 상속받는 인터페이스 B
 */
public interface B extends A {
	@Override
	public void methodB();
	
	/**
	 * B에서 정의한 디폴트 메서드
	 */
	default void method1() {
		System.out.println("B의 디폴트 메서드");
	}
}
