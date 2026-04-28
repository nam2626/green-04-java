package e05_interface;

/**
 * 인터페이스와 형변환, 익명 구현 객체 테스트 메인 클래스
 */
public class InterMain {

	public static void main(String[] args) {
		ClassC c = new ClassC();
		
		// 1. 인터페이스 A 타입으로 참조
		InterA interA = c;
		interA.interA();
		
		// 2. 인터페이스 B 타입으로 참조
		InterB interB = c;
		interB.interA();
		interB.interB();
		
		// 3. 부모 추상 클래스 타입으로 참조
		SuperClass su = c;
		su.interA();
		
		// 4. 인터페이스 타입에서 클래스 타입으로 강제 형변환
		SuperClass d = (SuperClass) interA;
		d.interA();
		
		// 5. 익명 구현 객체 (Anonymous Inner Class)
		// - 인터페이스를 별도의 클래스 정의 없이 즉석에서 구현하여 객체를 생성함
		InterA ia = new InterA() {
			@Override
			public void interA() {
				System.out.println("익명 구현 객체에서 구현된 interA");
			}
		};
		ia.interA();
		
		// 변수 재할당
		ia = d;
		ia.interA();
	}

}





