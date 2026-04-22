
public class E03_Operator1 {

	public static void main(String[] args) {
		//정수형 변수 두개 선언하여, 원하는 값으로 초기화
		int n1 = 10, n2 = 4;
		
		//위에 선언 변수 두개의 사칙연산 결과를 각각 출력
		//덧셈
		System.out.println(n1 + n2);
		//뺄셈
		System.out.println(n1 - n2);
		//곱셈
		System.out.println(n1 * n2);
		//나눗셈 - 몫
		System.out.println(n1 / n2);
		//나눗셈 - 나머지
		System.out.println(n1 % n2);
		
		//실수 두개 선언해서 초기화
		//사칙연산 결과 출력
		double d1 = 13.1455, d2 = 5.5345;
		System.out.println(d1 + d2);
		System.out.println(d1 - d2);
		System.out.println(d1 * d2);
		System.out.println(d1 / d2);
		System.out.println(d1 % d2);
		
		
		//증감 연산자
		// ++ --
		int a = 7, b = 7;				
		System.out.println(a);
		System.out.println(a++);//선 실행 후 증감
		System.out.println(a);

		System.out.println(b);
		System.out.println(--b);//선 증감 후 실행
		System.out.println(b);
		
		
	}

}






