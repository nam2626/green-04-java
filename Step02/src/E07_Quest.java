/**
 * 이 클래스는 삼항 연산자를 활용하여 두 숫자 중 큰 값을 찾는 예제입니다.
 */
public class E07_Quest {

	public static void main(String[] args) {
		// 0~99 사이의 랜덤한 정수 두 개 생성
		int n1 = (int)Math.floor(Math.random() * 100);
		int n2 = (int)Math.floor(Math.random() * 100);
		
		System.out.println("생성된 숫자: " + n1 + ", " + n2);
		
		// n1과 n2에 저장된 숫자 중 큰 숫자를 삼항 연산자로 비교하여 출력
		// 조건식(n1 > n2)이 true이면 n1을, false이면 n2를 반환
		int max = (n1 > n2) ? n1 : n2;
		System.out.println("더 큰 숫자는: " + max);
	}
}
