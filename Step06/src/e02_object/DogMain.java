package e02_object;

/**
 * Dog 객체의 복제 기능을 테스트하는 클래스
 */
public class DogMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		// 1. 원본 객체 생성
		Dog d1 = new Dog("흰둥이", 5);
		
		// 2. 객체 복제
		Dog d2 = (Dog) d1.clone();
		
		// 3. 원본 데이터 변경
		d1.setName("깜둥이");
		
		// 결과 출력 (원본은 "깜둥이", 복제본은 여전히 "흰둥이"여야 함)
		System.out.println("원본 d1: " + d1);
		System.out.println("복제본 d2: " + d2);
	}

}
