/**
 * 이 클래스는 while 반복문의 사용법을 학습하는 예제입니다.
 * 특정 조건이 참(true)인 동안 코드를 반복 실행하는 구조를 이해합니다.
 */
public class E07_While {

	public static void main(String[] args) {
		// 1 ~ 5 사이의 랜덤한 정수 생성 (반복 횟수 결정)
		int n = (int)Math.floor(Math.random() * 5) + 1;

		// 1. 추가 변수(i)를 카운터로 사용하여 숫자 n만큼 Hello World를 출력
		// 가장 일반적인 반복문 구현 방식입니다.
		int i = 0; // 반복 횟수를 제어할 카운터 변수 초기화
		System.out.println("n : " + n);
		
		while(i < n) { // i가 n보다 작은 동안 반복
			System.out.println("Hello World");
			i++; // 반복할 때마다 i를 1씩 증가시켜 탈출 조건에 접근
		}
		
		System.out.println("-----");
		
		// 2. 추가 변수 없이 구현 (기존 변수 n을 직접 감소)
		// 별도의 카운터 없이 입력받거나 생성된 값을 깎아가며 반복하는 방식입니다.
		/*
		while(n > 0) {
			System.out.println("Hello World");
			n--;
		}
		*/
		
		// n-- > 0 : n의 현재 값을 0과 비교한 뒤, n을 1 감소시킵니다.
		// 이 방식은 코드가 간결해지지만, 루프 종료 후 n의 값이 변한다는 점에 유의해야 합니다.
		while(n-- > 0) {
			System.out.println("Hello World");
		}
	}

}
