/**
 * 이 클래스는 복합 대입 연산자의 사용법을 설명합니다.
 */
public class E04_Operator2 {
	/*
	 *  복합 대입 연산자: 연산과 대입을 한 번에 처리합니다.
	 *  연산 결과를 왼쪽 변수에 다시 저장(누적)하는 방식입니다.
	 *  += (더해서 대입), -= (빼서 대입), *= (곱해서 대입), /= (나눠서 대입), %= (나머지 대입)
	 */
	
	public static void main(String[] args) {
		int n = 10;
		
		n += 2; // n = n + 2; -> 12
		System.out.println(n);
		
		n -= 2; // n = n - 2; -> 10
		System.out.println(n);
		
		n *= 2; // n = n * 2; -> 20
		System.out.println(n);
		
		n /= 2; // n = n / 2; -> 10
		System.out.println(n);
		
		n %= 2; // n = n % 2; -> 0
		System.out.println(n);
	}
}
