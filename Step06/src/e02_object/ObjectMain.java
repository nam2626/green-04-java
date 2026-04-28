package e02_object;

/**
 * Object 클래스의 주요 메서드(hashCode, equals) 테스트 클래스
 */
public class ObjectMain {

	public static void main(String[] args) {
		// 동일한 필드 값을 가진 두 객체 생성
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길동", 20);
		Person p3 = null;
		Person p4 = p1; // 참조 주소 복사
		
		// 재정의된 hashCode() 값 확인
		System.out.println("p1 hashCode: " + p1.hashCode());
		System.out.println("p2 hashCode: " + p2.hashCode());
		
		// equals() 메서드를 이용한 논리적 동등성 비교
		System.out.println("p1.equals(p2): " + p1.equals(p2)); // 내용이 같으므로 true
		System.out.println("p1.equals(\"Hello\"): " + p1.equals("Hello")); // 타입이 다르므로 false
		System.out.println("p1.equals(p3): " + p1.equals(p3)); // null이므로 false
		System.out.println("p1.equals(p4): " + p1.equals(p4)); // 동일 객체이므로 true
	}

}
