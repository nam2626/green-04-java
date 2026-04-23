/**
 * 이 클래스는 반복문의 흐름을 제어하는 break와 continue 키워드를 학습하는 예제입니다.
 */
public class E11_Break_Continue {

	public static void main(String[] args) {
		// 1. break 키워드 테스트
		// break는 감싸고 있는 가장 가까운 반복문을 즉시 종료하고 빠져나갑니다.
		System.out.println("--- break 테스트 (i가 5일 때 종료) ---");
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
			if(i == 5) {
				break; // i가 5가 되는 순간 for문을 종료
			}
		}
		System.out.println("\nbreak로 인해 반복문 종료");
		
		System.out.println("\n--- continue 테스트 (짝수일 때 건너뛰기) ---");
		// 2. continue 키워드 테스트
		// continue는 반복문의 나머지 코드를 실행하지 않고 다음 반복(증감식)으로 즉시 넘어갑니다.
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				continue; // i가 짝수이면 아래 출력문을 실행하지 않고 i++로 이동
			}
			// 홀수일 때만 출력됨
			System.out.print(i + " ");
		}
		System.out.println("\ncontinue로 인해 홀수만 출력됨");
	}

}
