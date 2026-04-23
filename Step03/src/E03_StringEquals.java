/**
 * 이 클래스는 자바에서 문자열을 비교할 때 주의해야 할 점을 설명합니다.
 */
public class E03_StringEquals {
	public static void main(String[] args) {
		// 문자열 리터럴로 생성 (상수 풀을 공유함)
		String str1 = "안녕하세요";
		String str2 = "안녕하세요";
		
		// new 키워드로 새로운 객체 생성 (메모리 주소가 다름)
		String str3 = new String("안녕하세요");
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		
		// == 연산자: 참조값(메모리 주소)을 비교합니다.
		System.out.println("str1 == str2 : " + (str1 == str2)); // true (리터럴 공유)
		System.out.println("str1 == str3 : " + (str1 == str3)); // false (주소값이 다름)
		System.out.println("str2 == str3 : " + (str2 == str3)); // false
		
		// .equals() 메서드: 객체 안에 실제 저장된 내용(값)을 비교합니다.
		// 자바에서 문자열의 내용을 비교할 때는 반드시 equals()를 사용해야 합니다.
		System.out.println("str1.equals(str3) : " + str1.equals(str3)); // true (내용이 같음)
		System.out.println("str2.equals(str3) : " + str2.equals(str3)); // true
	}
}
