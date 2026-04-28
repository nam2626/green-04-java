package e04_interface;

/**
 * Eat 인터페이스를 구현한 Dog 클래스
 */
public class Dog implements Eat {
	private int count = 0;

	/**
	 * 인터페이스의 추상 메서드를 구체화함
	 */
	@Override
	public void eat() {
		count++;
		System.out.println("개가 사료를 " + count + "번째 먹습니다.");
	}

}
