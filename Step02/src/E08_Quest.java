/**
 * 이 클래스는 두 숫자의 차이(절대값)를 구하는 다양한 방법을 설명합니다.
 */
public class E08_Quest {

	public static void main(String[] args) {
		int n1 = (int)Math.floor(Math.random() * 100);
		int n2 = (int)Math.floor(Math.random() * 100);
		
		System.out.println("숫자 1: " + n1 + ", 숫자 2: " + n2);
		
		// 목표: 두 숫자의 뺄셈 결과를 출력하되, 반드시 양수(절대값)가 나오게 처리
		
		// 방법 1: 삼항 연산자 사용 (직접 비교)
		System.out.print("방법 1 결과: ");
		System.out.println(n1 > n2 ? n1 - n2 : n2 - n1);
		
		// 방법 2: 계산 결과를 변수에 담고 삼항 연산자로 부호 처리
		int result = n1 - n2;
		result = result < 0 ? -result : result;
		System.out.println("방법 2 결과: " + result);
		
		// 방법 3: 자바에서 제공하는 수학 라이브러리(Math.abs) 사용
		// abs는 Absolute(절대값)의 약자입니다.
		System.out.println("방법 3 결과: " + Math.abs(n1 - n2));
	}
}
