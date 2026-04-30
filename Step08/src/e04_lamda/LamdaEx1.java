package e04_lamda;

public class LamdaEx1 {
	/*
	 *	람다(Lamda)
	 *		JDK8 버전부터 도입된 기능
	 *		함수형 프로그래밍 스타일 지원하는 방법으로
	 *		익명클래스의 한 형태로 추상 메서드를 간단하게 표현할 수 있음.
	 *
	 *		※ 반드시 추상메서드는 1개여야함
	 *
	 * 		(매개변수) -> 실행할 코드 한줄; <-- 한줄은 해당 연산결과를 리턴
	 * 
	 * 		(매개변수) -> {
	 * 			실행할 코드...
	 * 			실행할 코드...
	 * 			실행할 코드...
	 * 			실행할 코드...
	 * 			[return 값;]
	 * 		}
	 * 
	 */
	public static void main(String[] args) {
		//Calcurator를 익명 클래스로 만들어서
		//숫자 두개 덧셈하는 인스턴스 생성
		Calcurator sum = new Calcurator() {
			
			@Override
			public int calc(int x, int y) {
				return x + y;
			}
		};
		System.out.println(sum.calc(10, 5));
		
		Calcurator calc = (a,b) -> a+b;
		System.out.println(calc.calc(10, 5));
		
		// 뺄셈
		Calcurator minus = (x,y) -> x - y;
		System.out.println(minus.calc(10,5));
		// 곱셈
		Calcurator multiple = (a,c) -> a*c ;
		System.out.println(multiple.calc(10,5));
		
		// 두 숫자중에 큰 숫자 리턴
		Calcurator max = (a,b) -> a > b ? a : b;
		System.out.println(max.calc(10,5));
		
		//a~b까지 합을 리턴
		Calcurator total = (a,b) -> {
			int s = 0;
			for(int i = a;i<=b;i++) {
				s += i; 
			}
			return s;
		};
		System.out.println(total.calc(1, 100));
		
	}

}












