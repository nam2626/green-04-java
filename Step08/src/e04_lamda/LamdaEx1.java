package e04_lamda;

/**
 * 람다(Lambda) 표현식 예제
 * JDK 8부터 도입되었으며, 익명 클래스를 더 간결하게 표현할 수 있는 방법입니다.
 */
public class LamdaEx1 {
	/*
	 *	람다(Lambda) 특징:
	 *		- 함수형 프로그래밍 스타일을 지원
	 *		- 추상 메서드가 단 1개인 인터페이스(Functional Interface)에서만 사용 가능
	 *
	 * 		형식:
	 * 		(매개변수) -> { 실행할 코드 }
	 * 		실행할 코드가 한 줄인 경우 중괄호{}와 return 키워드 생략 가능
	 */
	public static void main(String[] args) {
		// 1. 익명 클래스로 인스턴스 생성 (기존 방식)
		Calcurator sum = new Calcurator() {
			
			@Override
			public int calc(int x, int y) {
				return x + y;
			}
		};
		System.out.println("익명 클래스 합계: " + sum.calc(10, 5));
		
		// 2. 람다식으로 인스턴스 생성 (덧셈)
		Calcurator calc = (a, b) -> a + b;
		System.out.println("람다식 합계: " + calc.calc(10, 5));
		
		// 뺄셈 람다식
		Calcurator minus = (x, y) -> x - y;
		System.out.println("뺄셈: " + minus.calc(10, 5));
		
		// 곱셈 람다식
		Calcurator multiple = (a, c) -> a * c;
		System.out.println("곱셈: " + multiple.calc(10, 5));
		
		// 두 숫자 중 큰 값을 반환하는 람다식 (삼항 연산자 활용)
		Calcurator max = (a, b) -> a > b ? a : b;
		System.out.println("최대값: " + max.calc(10, 5));
		
		// a부터 b까지의 합을 구하는 람다식 (여러 줄의 코드 포함)
		Calcurator total = (a, b) -> {
			int s = 0;
			for(int i = a; i <= b; i++) {
				s += i; 
			}
			return s; // 여러 줄인 경우 return 명시 필요
		};
		System.out.println("1부터 100까지의 합: " + total.calc(1, 100));
		
	}

}
