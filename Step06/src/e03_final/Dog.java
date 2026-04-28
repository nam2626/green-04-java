package e03_final;

/**
 * final 클래스: 상속(Extends)이 금지된 클래스
 * 더 이상 확장이 필요 없거나 보안상의 이유로 설계를 고정할 때 사용함 (예: String 클래스)
 */
public final class Dog extends Animal {
	
	// 부모의 eat() 메서드가 final이므로 아래와 같이 재정의 시도 시 컴파일 에러 발생
	/*
	@Override
	public void eat() {
		System.out.println("강아지가 사료를 먹습니다.");
	}
	*/
	
	/**
	 * 일반 메서드는 정의 가능
	 */
	public void run() {
		System.out.println("개가 달립니다.");
	}
}
