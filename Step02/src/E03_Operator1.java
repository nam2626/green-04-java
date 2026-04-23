/**
 * 이 클래스는 산술 연산자와 증감 연산자의 기초적인 사용법을 설명합니다.
 */
public class E03_Operator1 {

	public static void main(String[] args) {
		// 정수형 산술 연산
		int n1 = 10, n2 = 4;
		
		System.out.println(n1 + n2); // 덧셈: 14
		System.out.println(n1 - n2); // 뺄셈: 6
		System.out.println(n1 * n2); // 곱셈: 40
		System.out.println(n1 / n2); // 나눗셈(몫): 2 (정수끼리의 연산은 결과도 정수)
		System.out.println(n1 % n2); // 나머지 연산: 2 (10을 4로 나눈 나머지)
		
		// 실수형 산술 연산
		double d1 = 13.1455, d2 = 5.5345;
		System.out.println(d1 + d2);
		System.out.println(d1 - d2);
		System.out.println(d1 * d2);
		System.out.println(d1 / d2);
		System.out.println(d1 % d2);
		
		// 증감 연산자 (++, --)
		int a = 7, b = 7;				
		
		// 후위 증감 연산자 (a++): 현재 행의 실행을 마치고 나서 값이 변함
		System.out.println("현재 a: " + a);
		System.out.println("a++ 실행 중: " + a++); // 7 출력 후 a는 8이 됨
		System.out.println("a++ 실행 후: " + a);

		// 전위 증감 연산자 (--b): 현재 행을 실행하기 전에 먼저 값이 변함
		System.out.println("현재 b: " + b);
		System.out.println("--b 실행 중: " + --b); // 먼저 6이 된 후 출력
		System.out.println("--b 실행 후: " + b);
	}
}
