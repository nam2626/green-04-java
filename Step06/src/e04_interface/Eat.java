package e04_interface;

/**
 * 인터페이스(Interface)
 * - 클래스들이 구현해야 하는 기능의 명세(규격)를 정의함
 * - 'implements' 키워드를 사용하여 구현함
 * - 다중 구현이 가능함
 */
public interface Eat {
	/**
	 * 추상 메서드: 'public abstract' 키워드가 자동으로 붙음
	 */
	public void eat();
	
	/**
	 * 전역 상수: 'public static final' 키워드가 자동으로 붙음
	 */
	double PI = 3.1415;
}
