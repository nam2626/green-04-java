package e01_class;

/**
 * [객체 생성 및 사용]
 * 설계도(Class)를 바탕으로 실제 메모리에 구현된 실체를 '객체(Object)' 또는 '인스턴스(Instance)'라고 합니다.
 */
public class PersonMain {

	public static void main(String[] args) {
		/*
		 * 1. 객체 생성
		 * 클래스명 변수명 = new 클래스명();
		 * 'new' 키워드는 메모리(Heap 영역)에 새로운 공간을 할당하라는 의미입니다.
		 */
		Person p1 = new Person(); // 첫 번째 Person 객체 생성
		Person p2 = new Person(); // 두 번째 Person 객체 생성
		
		/*
		 * 2. 필드 초기화
		 * 생성된 객체마다 독립된 메모리 공간을 가지므로 p1과 p2는 서로 다른 데이터를 가질 수 있습니다.
		 */
		p1.init("홍길동", 20);
		p2.init("김철수", 33);
		
		/*
		 * 3. 메서드 호출
		 * 참조변수명.메서드명() 형태로 객체의 기능을 실행합니다.
		 */
		System.out.println("--- p1 정보 ---");
		p1.printInfo();
		
		System.out.println("--- p2 정보 ---");
		p2.printInfo();
	}

}
