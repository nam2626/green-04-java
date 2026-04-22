
public class E08_Quest {

	public static void main(String[] args) {
		int n1 = (int)Math.floor(Math.random() * 100);
		int n2 = (int)Math.floor(Math.random() * 100);
		
		// 두 숫자의 뺄셈 결과를 출력
		// 단, 반드시 양수가 나오게끔 처리
		System.out.println(n1 > n2 ? n1 - n2 : n2 - n1);
		
		int result = n1 - n2;
		result = result < 0 ? -result : result;
		System.out.println(result);
		
		System.out.println(Math.abs(n1-n2));

	}

}
