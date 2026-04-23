/**
 * 이 클래스는 자바 프로그램의 가장 기본적인 구조와 출력 방법을 설명합니다.
 */
public class E01_HelloWorld {

	// 자바 프로그램의 실행 시작점인 main 메서드입니다.
	// 모든 자바 애플리케이션은 반드시 하나의 main 메서드를 가져야 실행할 수 있습니다.
	public static void main(String[] args) {
		// System.out.println()은 괄호 안의 내용을 출력한 후 줄바꿈(Enter)을 수행합니다.
		System.out.println("Hello World"); // 문자열 출력
		System.out.println("남상규");       // 한글 문자열 출력
		System.out.println(30);           // 숫자(정수) 출력
		
		// System.out.print()는 내용을 출력하지만 줄바꿈을 하지 않습니다.
		System.out.print(10);             // 10 출력 후 줄바꿈 없음
		System.out.println(20);           // 이어서 20 출력 후 줄바꿈
		// 결과적으로 "1020"이 한 줄에 출력됩니다.
	}

}
