package e05_interface;

/**
 * 인터페이스 A
 */
public interface InterA {
	double PI = 3.1415;
	
	/**
	 * 추상 메서드
	 */
	public void interA();
	
	/**
	 * 디폴트 메서드(Default Method) - JDK 8부터 지원
	 * - 인터페이스 내에서 메서드 몸체({})를 가질 수 있음
	 * - 구현 클래스에서 반드시 재정의할 필요는 없지만, 필요시 재정의 가능함
	 * - 인터페이스에 새로운 기능을 추가할 때 기존 구현 클래스들과의 호환성을 유지하기 위해 사용함
	 */
	default double circleArea(double r) {
		return r * r * PI;
	}
}
