/**
 * 이 클래스는 조건문을 활용하여 숫자의 특성(홀수, 짝수, 0)을 판별하는 방법을 설명합니다.
 */
public class E02_if {

	public static void main(String[] args) {
		// 0~4 사이의 랜덤한 정수 생성
		int n = (int)Math.floor(Math.random() * 5);
		System.out.println("n : " + n);
		
		// 1. 효율적인 조건 처리 (if-else if-else)
		// 조건이 맞으면 나머지 조건은 검사하지 않고 넘어갑니다.
		if(n % 2 == 1) {
			System.out.println("홀수");
		} else if(n == 0) {
			System.out.println(0);
		} else {
			System.out.println("짝수");
		}
		
		System.out.println("------------------------");
		
		// 2. 개별 조건 처리 (독립된 if문)
		// 모든 if문의 조건을 하나하나 검사합니다.
		if(n % 2 == 1) {
			System.out.println("홀수");
		}
		if(n == 0) {
			System.out.println(0);
		}
		// 짝수이면서 0이 아닐 때만 "짝수" 출력
		if(n % 2 == 0 && n != 0){
			System.out.println("짝수");
		}
	}
}
