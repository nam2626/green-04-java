/**
 * 이 클래스는 자바에서 데이터를 저장하는 가장 기초적인 단위인 변수(Variable)의 선언과 사용법을 설명합니다.
 */
public class E01_Variable {
	/*
	 * 	자바의 기본 데이터 종류 (Data Types)
	 * 		정수 : 양수, 음수, 0 (예: 10, -5, 0)
	 * 		실수 : 소수점이 포함된 숫자 (예: 3.14, -0.5)
	 * 		문자 : 한 개의 글자 (예: 'A', '가') - 작은따옴표 사용
	 * 		문자열 : 하나 이상의 문자로 구성된 텍스트 (예: "Hello") - 큰따옴표 사용
	 * 		논리 : 참(true) 또는 거짓(false)
	 * 
	 *	변수 선언 방법:
	 *		데이터타입 변수명;
	 *      (예: int age;)
	 */
	public static void main(String[] args) {
		// 변수 선언 방법 1: 선언 후 값 대입
		int num; // 정수(int)를 저장할 수 있는 'num'이라는 이름의 메모리 공간을 확보
		num = 100; // 변수 num에 100이라는 값을 대입(저장)
		System.out.println(num); // num 공간에 들어있는 값(100)을 읽어와서 출력
		
		// 변수 선언 방법 2: 선언과 동시에 초기화
		int num1 = 100; // 초기화(Initialize): 변수를 만들자마자 처음 값을 저장하는 것
		
		// 여러 변수를 한 번에 선언하고 초기화하기
		int num2 = 200, num3 = 300; 

		System.out.println(num1 + num2 + num3);
		
		// 연속 대입 연산
		int n = 10;
		n = num1 = num2 = 30000; // 오른쪽에서 왼쪽 순서로 값이 대입됨 (30000이 num2, num1, n 순으로 들어감)
		System.out.println(n);
	}
}
