package e02_object;

import java.util.Objects;

/**
 * 사용자 정보를 저장하는 클래스
 * Object 클래스의 메서드들을 재정의하여 객체 비교 및 정보 확인에 활용함
 */
public class Person {
	private String name; // 이름
	private int age;     // 나이
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	/**
	 * 객체의 필드 정보를 문자열로 반환함
	 * 재정의하지 않으면 '클래스명@해시코드' 형식이 반환됨
	 */
	@Override
	public String toString() {
		return name + " / " + age;
	}

	/**
	 * 객체의 필드 값을 기반으로 고유한 정수 값을 생성함
	 * 두 객체의 논리적 동등성을 비교할 때 equals와 함께 사용됨
	 */
	@Override
	public int hashCode() {
		// Objects.hash()를 사용하면 여러 필드를 조합한 해시값을 쉽게 생성 가능
		return Objects.hash(name, age);
	}

	/**
	 * 객체 내부의 값이 동일한지 비교함
	 */
	@Override
	public boolean equals(Object obj) {
		// 1. 비교 대상이 null인지 확인
		if(obj == null) return false;
		
		// 2. 메모리 주소(참조)가 같은지 확인 (동일 객체 여부)
		if(obj == this) return true;
		
		// 3. 해시값이 다르면 내용이 반드시 다르므로 false 반환 (성능 향상)
		if(hashCode() != obj.hashCode()) return false;
		
		// 4. 타입 비교 및 형변환 후 필드 값 비교
		if(obj instanceof Person) {
			Person temp = (Person)obj;
			// 이름과 나이가 모두 일치해야 동일한 데이터로 간주
			return name.equals(temp.name) && age == temp.age;
		}
		return false;
	}
	
}












