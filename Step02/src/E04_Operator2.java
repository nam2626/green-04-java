
public class E04_Operator2 {
	/*
	 *  복합 대입 연산자 : 연산 결과를 왼쪽에 있는 변수에 연산 후 저장(누적)
	 *  	+=	-=	*=	/=	%=
	 */
	
	public static void main(String[] args) {
		int n = 10;
		
		n += 2; // n = n + 2;
		System.out.println(n);
		n -= 2; // n = n - 2;
		System.out.println(n);
		n *= 2; // n = n * 2;
		System.out.println(n);
		n /= 2; // n = n / 2;
		System.out.println(n);
		n %= 2; // n = n % 2;
		System.out.println(n);
	}

}







