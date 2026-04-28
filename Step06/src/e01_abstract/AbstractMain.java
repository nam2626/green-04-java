package e01_abstract;

/**
 * 추상 클래스의 특징을 확인하는 메인 클래스
 */
public class AbstractMain {

	public static void main(String[] args) {
		// 1. 추상 클래스는 직접 객체 생성이 불가능함
		// Animal a = new Animal(); // 컴파일 에러 발생
		
		// 2. 자식 클래스(구체 클래스)는 인스턴스화가 가능함
		// 이때 부모인 Animal의 생성자도 함께 호출됨
		Dog d = new Dog();
		d.run();
		d.eat(); // 부모로부터 상속받은 일반 메서드 호출
		
		// 3. 추상 클래스도 데이터 타입으로 사용 가능 (다형성)
		// 부모 타입의 변수에 자식 객체를 저장할 수 있음
		Animal a = d;
		a.run(); // 재정의된 메서드가 실행됨
	}

}
