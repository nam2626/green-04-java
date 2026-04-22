
public class E05_Casting {
	/*
	 * 	데이터 형변환 : 데이터 타입을 바꾸는 행위
	 * 	
	 *  자동으로 데이터가 형변환 : 연산할 때 자동으로 변환
	 * 			- 수의 체계상 작은 개념과 큰 개념이 계산 했을 때
	 * 				--> 실수와 정수를 계산할때 정수가 실수로 바뀜
	 * 			- 메모리 바이트 수가 작은 타입이 큰 타입과 계산 했을 때
	 * 				--> int와 long이 계산했을 때 int가 long으로 형변환
	 * 			- short, byte타입에는 int형으로 데이터가 넣을 때 자동변환 
	 * 
	 *	강제로 데이터 형변환 : 데이터 손실이 일어날 수 있음
	 *  		- 큰 개념을 작은 개념으로 바꿔야 될때 --> 실수 -> 정수
	 *  		- 메모리 바이트 수가 큰 타입을 작은 타입으로 바꿔야 될때 
	 *  				--> long -> int, double -> float
	 */
	public static void main(String[] args) {
		int n = 120;
		double d = 5.456;
		// 자동으로 형변환 되는 경우
		System.out.println(n / d);
		
		//강제로 형변환하는 방법
		//(바꾸고 싶은 변수 타입) 값 or 변수
		double pi = 3.1415;
		int i = (int)pi;
		System.out.println(i);
		
		i = 65;
		char ch1 = (char)i;
		System.out.println(ch1);
		System.out.println((int)'1');
	}

}









