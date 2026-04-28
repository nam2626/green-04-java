package e06_diamond;

/**
 * B와 C를 동시에 상속받는 인터페이스 D (다이아몬드 상속 구조)
 */
public interface D extends B, C {
	public void methodD();
	
	/**
	 * 다이아몬드 상속 시, 부모 인터페이스(B, C)들 사이에 동일한 이름의 디폴트 메서드(method1)가 있으면 충돌이 발생함
	 * 이 경우 반드시 구현 클래스나 인터페이스에서 재정의(Override)하여 어떤 부모의 메서드를 사용할지 명시해야 함
	 */
	@Override
	default void method1() {
		// 특정 부모 인터페이스의 디폴트 메서드를 명시적으로 호출하는 방법
		C.super.method1();
		B.super.method1();
		System.out.println("D에서 재정의된 method1");
	}
}
