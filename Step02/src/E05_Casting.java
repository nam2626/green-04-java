/**
 * 이 클래스는 자바의 데이터 형변환(Casting) 개념을 설명합니다.
 */
public class E05_Casting {
	/*
	 * 	데이터 형변환: 데이터의 타입을 일시적으로 또는 영구적으로 바꾸는 행위
	 * 	
	 *  1. 자동 형변환 (Implicit Casting / Promotion):
	 * 		- 작은 타입에서 큰 타입으로 연산할 때 자동으로 발생 (데이터 손실 없음)
	 * 		- 정수와 실수가 계산되면 정수가 실수가 됨 (예: int + double -> double)
	 * 		- 바이트 수가 작은 타입이 큰 타입과 계산될 때 (예: int + long -> long)
	 * 
	 *	2. 강제 형변환 (Explicit Casting / Demotion):
	 *  	- 큰 타입에서 작은 타입으로 바꿀 때 명시적으로 수행 (데이터 손실 가능성 있음)
	 *  	- 방법: (바꾸고 싶은 타입)값;
	 */
	public static void main(String[] args) {
		int n = 120;
		double d = 5.456;
		
		// 자동 형변환 예시: n(int)이 double로 변환되어 계산됨
		System.out.println(n / d);
		
		// 강제 형변환 예시
		double pi = 3.1415;
		int i = (int)pi; // 실수를 정수로 강제 형변환하면 소수점 아래가 버려짐
		System.out.println(i); // 3 출력
		
		// 문자와 정수 사이의 형변환
		i = 65;
		char ch1 = (char)i; // ASCII/Unicode 65는 'A'임
		System.out.println(ch1);
		
		// 문자 '1'의 유니코드 정수값 확인
		System.out.println((int)'1'); // '1'의 아스키 코드값인 49가 출력됨
	}
}
