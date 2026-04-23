package e01_class;

/**
 * [클래스(Class) 기초]
 * 클래스는 객체를 만들기 위한 '설계도' 또는 '틀'입니다.
 * 현실 세계의 사물이나 개념을 프로그래밍 세계에서 사용하기 위해 데이터(필드)와 동작(메서드)으로 정의합니다.
 */
public class Person {
	/*
	 * 필드(Field) / 멤버 변수
	 * 객체의 상태나 속성을 저장하는 변수입니다.
	 */
	// 이름 속성
	String name;
	// 나이 속성
	int age;
	
	/**
	 * 데이터 초기화를 위한 메서드
	 * @param n 외부에서 전달받은 이름
	 * @param a 외부에서 전달받은 나이
	 */
	void init(String n, int a) {
		name = n; // 매개변수로 받은 값을 필드에 저장
		age = a;
	}
	
	/**
	 * 메서드(Method)
	 * 객체의 기능이나 동작을 정의합니다.
	 * 필드에 저장된 데이터를 사용하거나 변경할 수 있습니다.
	 */
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
