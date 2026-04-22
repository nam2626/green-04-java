
public class E06_Operator {

	public static void main(String[] args) {
		int n1 = 10, n2 = 7;
		// >  <  >=  <=  ==  !=
		System.out.println(n1 > n2);
		System.out.println(n1 < n2);
		System.out.println(n1 >= n2);
		System.out.println(n1 <= n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		
		/*
		 * 	논리 연산자 : 조건식들을 두개 이상 사용하거나, 조건식의 결과를 반대로 뒤집을 때
		 * 	AND : 양쪽의 조건식이 모두 true일때 true가 되는 연산자 --> && 
		 * 	OR : 양쪽의 조건식이 둘 중에 하나라도 true 이면 true가 되는 연산자 --> ||
		 *  NOT : 조건식의 결과를 반대로 뒤집는 연산 --> !
		 */
		//n1이 5보다 크고 20보다 작냐?
		System.out.println(n1 > 5 && n1 < 20);
		//n2가 양수이면서 짝수냐?
		System.out.println(n2 > 0 && n2 % 2 == 0);
		//n1이 5보다 크거나 n2가 10보다 작냐?
		System.out.println(n1 > 5 || n2 < 10);
		
		boolean flag = n1 > 5 || n2 < 10;
		System.out.println(!flag);
	}

}












