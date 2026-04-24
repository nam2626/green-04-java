package e02_constructor;

public class PersonMain {

	public static void main(String[] args) {
		/**
		 * new 연산자를 통해 객체를 생성할 때, 클래스명 뒤의 ()는 생성자 호출을 의미함.
		 * "홍길동"과 21이라는 인자(Argument)를 전달하여 Person 생성자를 실행함.
		 */
		Person p1 = new Person("홍길동", 21);
		
		// 정보 출력 메서드 호출
		p1.printInfo();

	}

}
