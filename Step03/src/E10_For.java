import java.util.Scanner;

/**
 * 이 클래스는 사용자로부터 입력받은 두 정수 사이의 모든 숫자의 합을 구하는 예제입니다.
 * 입력받은 두 숫자의 크기 순서에 상관없이 작은 수부터 큰 수까지의 합을 계산합니다.
 */
public class E10_For {
	/*
	 * 문제: 정수 두 개를 입력받은 후에 입력받은 숫자의 작은 숫자부터 큰 숫자까지의 합을 출력하세요.
	 * 
	 * 실행 예시>
	 * 숫자 입력 > 1
	 * 숫자 입력 > 10
	 * 1 ~ 10 까지 합 : 55
	 * -------------------------
	 * 숫자 입력 > 10
	 * 숫자 입력 > 1
	 * 1 ~ 10 까지 합 : 55
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 사용자로부터 두 정수 입력받기
		System.out.print("첫 번째 숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 : ");
		int n2 = sc.nextInt();
		
		System.out.println("입력된 숫자: " + n1 + " / " + n2 );
		
		// 2. 총합을 저장할 변수 초기화
		int total = 0;
		
		// 3. n1에 반드시 작은 값이 오도록 셋팅 (변수 값 교환 - Swap 로직)
		// n1이 n2보다 크다면, 두 변수의 값을 서로 바꿉니다.
		if(n1 > n2) {
			int temp = n1; // 임시 변수(temp)를 사용하여 n1의 값을 백업
			n1 = n2;       // n2의 값을 n1에 대입
			n2 = temp;     // 백업해둔 n1의 값을 n2에 대입
		}
		
		// 4. for 반복문을 사용하여 n1부터 n2까지의 합계 계산
		// 초기화식을 생략한 형태: 이미 n1이 시작값으로 설정되어 있으므로 생략 가능합니다.
		for(; n1 <= n2; n1++) {
			total += n1; // total = total + n1;
		}
		
		// 5. 결과 출력
		System.out.println("두 숫자 사이의 합계: " + total);
		
		sc.close(); // 스캐너 자원 해제
	}

}
