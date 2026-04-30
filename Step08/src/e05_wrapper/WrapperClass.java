package e05_wrapper;

/**
 * 래퍼 클래스(Wrapper Class) 예제
 * 기본 자료형(Primitive Type)을 객체 형태로 다루기 위해 사용하는 클래스입니다.
 */
public class WrapperClass {
	/*
	 * 래퍼 클래스 종류:
	 * int -> Integer, double -> Double, float -> Float, short -> Short
	 * long -> Long, byte -> Byte, char -> Character, boolean -> Boolean
	 */
	public static void main(String[] args) {
		// 1. 오토 박싱(Auto Boxing): 기본형이 자동으로 래퍼 객체로 변환됨
		Integer n1 = 10;
		int n2 = 20;

		// 2. 오토 언박싱(Auto Unboxing): 래퍼 객체가 자동으로 기본형으로 변환됨
		System.out.println("연산 결과: " + (n1 + n2));

		// 3. 래퍼 클래스가 제공하는 상수들
		System.out.println("int 최대값: " + Integer.MAX_VALUE);
		System.out.println("int 최소값: " + Integer.MIN_VALUE);
		System.out.println("int 바이트수: " + Integer.BYTES);
		System.out.println("int 비트수: " + Integer.SIZE);

		// 4. 문자열을 숫자로 변환 (중요!)
		System.out.println("정수 변환: " + (Integer.parseInt("1234") + 1000));
		System.out.println("2진수 문자열을 정수로: " + Integer.parseInt("1101", 2));
		System.out.println("16진수 문자열을 정수로: " + Integer.parseInt("A", 16));
		System.out.println("실수 변환: " + (Double.parseDouble("12.34") + 1000));

		// 5. 다양한 진법 표현 방법
		System.out.println("16진수(0x): " + 0x10); // 16
		System.out.println("8진수(0): " + 010);   // 8
		
		// 6. 박싱과 언박싱 예시
		int i1 = 100;
		Integer i2 = i1; // 오토 박싱
		int i3 = i2;     // 오토 언박싱
		
		// JDK 1.5 미만에서의 수동 박싱/언박싱 방식 (참고용)
		int i4 = 100;
		@SuppressWarnings("deprecation")
		Integer i5 = new Integer(i4); // 수동 박싱
		int i6 = i5.intValue();       // 수동 언박싱
		System.out.println("수동 변환 값: " + i6);
	}

}
