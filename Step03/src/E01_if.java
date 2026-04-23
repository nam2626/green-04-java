/**
 * 이 클래스는 조건문 if-else if-else의 기본적인 구조와 사용법을 설명합니다.
 */
public class E01_if {
	
	public static void main(String[] args) {
		int n = 10;
		
		// 1. if-else if-else 구조
		// 여러 조건 중 하나만 실행하고 싶을 때 사용합니다.
		// n이 0이면 '0' 출력, 양수면 '양수' 출력, 음수면 '음수' 출력
		if(n == 0) {
			System.out.println(0);
		}
		else if(n > 0) {
			System.out.println("양수");
		}
		else {
			System.out.println("음수");
		}
		
		// 2. 단독 if문 나열
		// 각 조건의 성립 여부를 모두 개별적으로 체크합니다.
		if(n == 0) {
			System.out.println(0);
		}
		if(n > 0) {
			System.out.println("양수");
		}
		if(n < 0)  {
			System.out.println("음수");
		}
	}
}
