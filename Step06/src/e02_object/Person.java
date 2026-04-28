package e02_object;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	/*	객체가 가지고 있는 필드, 메서드의 결과를
	 * 	외부에서 쉽게 확인이 가능하게
	 * 	필드와 메서드의 결과를 문자열로 만들어서 리턴하는 메서드
	 * 
	 * 	재정의하지 않으면
	 * 	타입명@객체의 해시코드(16진수)
	 */
	@Override
	public String toString() {
		return name + " / " + age;
	}
	/*
	 * 해시값을 기반으로 사용되는 컬렉션에서 사용할 정수 값을 제공하는 목적
	 * 두 객체가 동일한 객체인지 확인하기위한 정수값을 제공하는 목적
	 * 
	 * Object 클래스에서는 기본적으로는 객체의 주소값에 해당하는 해시값을 리턴
	 */
	@Override
	public int hashCode() {
//		return name.hashCode() + age;
		return Objects.hash(name,age);
	}
	
}









