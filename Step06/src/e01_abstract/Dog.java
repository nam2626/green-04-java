package e01_abstract;

/**
 * Animal 추상 클래스를 상속받는 구체 클래스(Concrete Class)
 */
public class Dog extends Animal {

	/**
	 * 부모(Animal)의 추상 메서드를 반드시 구현해야 함
	 */
	@Override
	public void run() {
		// 추상 메서드는 부모에 구현체가 없으므로 super.run() 호출 불가
		System.out.println("개가 네 발로 달립니다.");
	}

}
