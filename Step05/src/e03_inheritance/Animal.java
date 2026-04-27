package e03_inheritance;

/**
 * 상속 관계에서 부모 클래스(Parent Class / Super Class) 역할을 함
 */
public class Animal {
	
	public Animal() {
		System.out.println("Animal Constructor");
	}
	
	/**
	 * 자식 클래스들이 공통적으로 가지는 동작을 정의
	 */
	public void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
	
	public void run() {
		System.out.println("동물이 달립니다.");
	}
}
