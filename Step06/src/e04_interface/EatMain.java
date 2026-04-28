package e04_interface;

/**
 * 인터페이스를 활용한 다형성 테스트 메인 클래스
 */
public class EatMain {

	public static void main(String[] args) {
		// 각 클래스의 객체 생성
		Person p = new Person();
		Employee e = new Employee();
		Dog d = new Dog();
		
		// 직접 호출
		p.eat();
		e.eat();
		d.eat();

		System.out.println("--------------------");
		
		// 인터페이스 타입의 변수로 각 객체를 참조 (형변환)
		// 서로 다른 클래스들이라도 같은 인터페이스를 구현했다면 동일한 타입으로 관리 가능
		Eat a = p;
		a.eat();
		
		a = e;
		a.eat();
		
		a = d;
		a.eat();
	}

}





