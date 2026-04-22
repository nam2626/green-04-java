
public class E07_Quest {

	public static void main(String[] args) {
		int n1 = (int)Math.floor(Math.random() * 100);
		int n2 = (int)Math.floor(Math.random() * 100);
		
		System.out.println(n1 + " " + n2);
		//n1과 n2에 저장된 숫자 중 큰 숫자를 출력
		System.out.println(n1 > n2 ? n1 : n2);
	}

}
