package e03_final;

/**
 * 부모 클래스
 */
public class Animal {
	/**
	 * final 메서드: 자식 클래스에서 오버라이딩(재정의)을 금지함
	 * 보안상의 이유나 설계 의도에 따라 변경되어서는 안 되는 핵심 로직에 사용함
	 */
	public final void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
}
