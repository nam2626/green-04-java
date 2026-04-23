/**
 * 이 클래스는 자바의 다양한 기본 데이터 타입(Primitive Types)과 그 특징을 설명합니다.
 */
public class E02_VariableType {

	public static void main(String[] args) {
		// 1. 정수형 타입
		// int: 가장 많이 쓰이는 4바이트 정수 타입 (약 -21억 ~ 21억)
		int i = 2147483647;
		System.out.println(i);
		
		// long: 8바이트 정수 타입. 아주 큰 숫자를 저장할 때 사용. 리터럴 뒤에 'L'을 붙임.
		long l = 9223372036854775807L;
		l = 1L;
		System.out.println(l);
		
		// byte: 1바이트 정수 타입 (-128 ~ 127)
		byte b = 127;
		System.out.println(b);
		b++; // 오버플로우(Overflow) 발생: 범위를 넘어가면 최소값인 -128로 돌아감
		System.out.println(b);
		
		// 2. 실수형 타입
		// float: 4바이트 실수 타입. 리터럴 뒤에 'F'를 붙임.
		float f = 3.14F;
		// double: 8바이트 실수 타입. 실수의 기본형.
		double d = 3.14;
		
		System.out.println(f);
		System.out.println(d);
		
		// 3. 문자형 타입
		// char: 2바이트 문자 타입. 한 글자만 저장 가능. 유니코드를 지원함.
		char ch1 = 'A';
		char ch2 = '가';
		System.out.println(ch1);
		System.out.println(ch2);
		
		// 4. 논리형 타입
		// boolean: true(참) 또는 false(거짓)만 저장 가능
		boolean flag = true;
		System.out.println(flag);
		flag = false;
		System.out.println(flag);
	}
}
