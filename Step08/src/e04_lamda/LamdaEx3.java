package e04_lamda;

/**
 * 제네릭(Generic) 인터페이스와 람다식을 함께 사용하는 예제
 */
public class LamdaEx3 {
	/**
	 * 제네릭 메서드: 타입 T를 매개변수로 받아 계산을 수행합니다.
	 */
	public static <T> void run(Method<T> m, T a, T b) {
		System.out.println("제네릭 실행 결과: " + m.run(a, b));
	}
	
	public static void main(String[] args) {
		// 정수형(Integer) 덧셈
		Method<Integer> m1 = (a, b) -> a + b;
		// 문자열(String) 연결
		Method<String> m2 = (a, b) -> a + b;
		// 실수형(Double) 덧셈
		Method<Double> m3 = (a, b) -> a + b;
		
		System.out.println(m1.run(5, 2));
		System.out.println(m2.run("Hello", "5"));
		System.out.println(m3.run(5.14, 2.45));
		
		// 메서드 호출 시 직접 타입을 유추하여 람다식 전달
		run((a, b) -> a - b, 10, 20); // Integer로 추론
		run((a, b) -> a + b, 10.5, 20.2); // Double로 추론
		run((a, b) -> a + b, "Hello", "World"); // String으로 추론
	}

}
