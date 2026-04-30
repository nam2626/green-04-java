package e05_wrapper;

public class WrapperClass {
	/*
	 * Wrapper 클래스는 기존의 Primitive 변수 타입을 Reference 형 타입으로 바꿀때 사용되는 클래스 각 타입에 대한 기능과
	 * 정보를 담고 있음.
	 * 
	 * Primitive Wrapper int -> Integer double -> Double float -> Float Short ->
	 * Short long -> Long byte -> Byte char -> Character
	 */
	public static void main(String[] args) {
		Integer n1 = 10;
		int n2 = 20;

		System.out.println(n1 + n2);

		// int 형 타입의 최대값, 최소값, 바이트수, 사이즈(bit)
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);

		// 문자열을 정수형으로 바꿀때
		System.out.println(Integer.parseInt("1234") + 1000);
		System.out.println(Integer.parseInt("1101", 2));
		System.out.println(Integer.parseInt("A", 16));
		System.out.println(Double.parseDouble("12.34") + 1000);

		// 16진수 표현 방법 - 0x 로 시작
		System.out.println(0x10);
		System.out.println(0xA);
		// 8진수 표현 방법 - 0 으로 시작
		System.out.println(010);
		
		//auto boxing
		int i1 = 100;
		Integer i2 = i1;
		
		//auto unboxing
		int i3 = i2;
		
		//1.5(미만)버전에서 처리방법
		int i4 = 100;
		//boxing
		Integer i5 = new Integer(i4);
		System.out.println(i5);
		//unboxing
		int i6 = i5.intValue();
		System.out.println(i6);
	}

}















