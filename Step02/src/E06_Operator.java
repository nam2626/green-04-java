/**
 * 이 클래스는 비교 연산자, 논리 연산자, 그리고 삼항 연산자를 설명합니다.
 */
public class E06_Operator {

	public static void main(String[] args) {
		int n1 = 10, n2 = 7;
		
		// 1. 비교 연산자: 결과는 항상 boolean(true/false)
		// > (크다), < (작다), >= (크거나 같다), <= (작거나 같다), == (같다), != (같지 않다)
		System.out.println(n1 > n2);
		System.out.println(n1 < n2);
		System.out.println(n1 >= n2);
		System.out.println(n1 <= n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		
		/*
		 * 	2. 논리 연산자: 여러 조건을 조합할 때 사용
		 * 	AND (&&) : 양쪽 모두 true여야 결과가 true
		 * 	OR  (||) : 둘 중 하나만 true여도 결과가 true
		 *  NOT (!)  : true를 false로, false를 true로 반전
		 */
		// n1이 5보다 크고(AND) 20보다 작은가?
		System.out.println(n1 > 5 && n1 < 20);
		// n2가 양수이면서(AND) 짝수인가?
		System.out.println(n2 > 0 && n2 % 2 == 0);
		// n1이 5보다 크거나(OR) n2가 10보다 작은가?
		System.out.println(n1 > 5 || n2 < 10);
		
		boolean flag = n1 > 5 || n2 < 10;
		System.out.println(!flag); // 결과 반전
		
		/*
		 * 	3. 단락 회로 평가 (Short-Circuit Evaluation)
		 * 		논리 연산 시 앞의 조건만으로 결과가 확정되면 뒤의 조건은 실행하지 않음
		 */
		// OR 연산: 앞이 true면 뒤는 검사하지 않음
		System.out.println(n1 < 5 || ++n2 > 10); // n1 < 5 가 false이므로 뒤를 실행함. n2는 8이 됨.
		System.out.println("n2의 현재 값: " + n2); 
		
		// AND 연산: 앞이 false면 뒤는 검사하지 않음
		System.out.println(n1 > 5 && ++n2 > 10); // n1 > 5 가 true이므로 뒤를 실행함. n2는 9가 됨.
		System.out.println("n2의 현재 값: " + n2);
		
		/*
		 *  4. 삼항 연산자 (Conditional Operator)
		 *  조건식 ? 참일때_값 : 거짓일때_값
		 */
		int num = (int)Math.floor(Math.random() * 100); // 0~99 사이의 랜덤 숫자 생성
		String result = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(num + "은(는) " + result + "입니다.");
	}
}
