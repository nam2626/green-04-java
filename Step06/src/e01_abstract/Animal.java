package e01_abstract;

/**
 * 추상 클래스(Abstract Class)
 * - 일반적으로 최상위 클래스로 존재하며, 자식 클래스들의 공통적인 구조를 정의함
 * - 'abstract' 키워드를 클래스 선언부에 붙임
 * - 직접 객체를 생성(new Animal())할 수 없음
 * - 자식 클래스가 인스턴스화될 때 생성자가 호출되어 간접적으로 생성됨
 */
public abstract class Animal {

	public Animal() {
		System.out.println("Animal 생성자 호출 (추상 클래스 생성)");
	}
	
	/**
	 * 일반 메서드: 자식 클래스에서 공통으로 사용할 기능을 구현함
	 */
	public void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}

	/**
	 * 추상 메서드(Abstract Method)
	 * - 선언부만 있고 몸체({})가 없는 메서드
	 * - 'abstract' 키워드를 붙이며, 세미콜론(;)으로 종료함
	 * - 이 클래스를 상속받는 자식 클래스는 반드시 이 메서드를 재정의(Override)해야 함
	 * - 추상 메서드를 하나라도 포함하고 있으면 해당 클래스는 반드시 추상 클래스여야 함
	 */
	public abstract void run();
}



