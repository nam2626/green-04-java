/**
 * 이 클래스는 기본적인 연산 출력과 문자열 연결, 그리고 특수 문자(Escape Sequence)의 사용법을 설명합니다.
 */
public class E02_PrintMain {

	public static void main(String[] args) {
		// 숫자 연산 결과 출력
		System.out.println(10);         // 정수 10 출력
		System.out.println(10 + 5);     // 덧셈 결과 15 출력
		System.out.println(10 - 5);     // 뺄셈 결과 5 출력
		
		// 문자열 연결 연산자 (+)
		// 문자열과 문자열을 더하면 하나의 문자열로 합쳐집니다.
		System.out.println("Hello " + "World"); // "Hello World"
		
		// 문자열과 숫자를 더하면 숫자가 문자열로 변환되어 합쳐집니다.
		System.out.println("Hello " + 10);      // "Hello 10"
		
		// 연산 순서에 주의: 왼쪽에서 오른쪽으로 진행됩니다.
		// "Hello " + 10이 먼저 수행되어 "Hello 10"이 되고, 여기에 + 5가 되어 "Hello 105"가 됩니다.
		System.out.println("Hello " + 10 + 5);  // "Hello 105"
		
		// 특수 문자 (Escape Sequence)
		// \t : 탭(Tab) 만큼 띄우기
		// \n : 줄바꿈(New Line / Line Feed)
		System.out.println("Hello\tWor\nld");
		
		// \\ : 역슬래시(\) 출력
		// \" : 큰따옴표(") 출력
		// \' : 작은따옴표(') 출력
		System.out.println("Hello \"World\"");      // Hello "World" 출력
		System.out.println("Hello \\ \'World\'");   // Hello \ 'World' 출력
	}

}
