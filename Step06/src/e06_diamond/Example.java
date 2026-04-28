package e06_diamond;

/**
 * 모든 추상 메서드를 최종적으로 구현하는 클래스
 */
public class Example implements A, B, C, D {

	@Override
	public void methodD() {
		System.out.println("methodD 구현");
	}

	@Override
	public void methodC() {
		System.out.println("methodC 구현");
	}

	@Override
	public void methodB() {
		System.out.println("methodB 구현");
	}

	@Override
	public void methodA() {
		System.out.println("methodA 구현");
	}

}
