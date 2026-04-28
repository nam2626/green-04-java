package e01_list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * List 인터페이스의 주요 특징과 활용법을 보여주는 예제
 */
public class ListExample {
	/*
	 * 	List 인터페이스의 특징
	 * 		1. 데이터의 순서가 유지됨 (저장된 순서대로 인덱스가 부여됨)
	 * 		2. 데이터의 중복 저장을 허용함
	 * 
	 *  주요 구현 클래스:
	 *  - ArrayList: 내부적으로 배열을 사용하여 데이터를 관리함. 조회 속도가 빠르지만 중간 삽입/삭제는 상대적으로 느림
	 *  - LinkedList: 각 데이터를 노드 단위로 연결하여 관리함. 중간 삽입/삭제 속도가 빠름
	 *  - Vector: ArrayList와 동일한 구조이나, 멀티스레드 환경을 위해 동기화(Synchronized)가 적용됨
	 */
	public static void main(String[] args) {
		// 문자열(String)만 저장할 수 있는 제네릭(<>) 기반 ArrayList 생성
		ArrayList<String> list = new ArrayList<String>();
		
		// 1. 데이터 추가 (add)
		list.add("HTML/CSS");
		list.add("javascript");
		list.add("React");
		list.add("MySQL");
		list.add("jsp/Servlet");
		list.add("Spring");
		list.add("MySQL"); // 중복 데이터 허용 확인
		list.add("RTOS");

		System.out.println("초기 리스트: " + list);
		
		// 2. 데이터 삭제 (remove)
		list.remove(1); // 1번 인덱스(javascript) 삭제
		System.out.println("인덱스 1 삭제 후: " + list);
		
		list.remove("MySQL"); // 리스트에서 '최초로' 검색된 해당 데이터 삭제
		System.out.println("'MySQL' 삭제 후: " + list);
		
		// 3. 리스트 크기 확인 (size)
		System.out.println("현재 데이터 개수: " + list.size());
		
		// 4. 특정 위치에 데이터 삽입
		list.add(2, "Kotlin");
		System.out.println("인덱스 2에 Kotlin 삽입 후: " + list);
		
		// 5. 특정 위치의 데이터 교체 (set)
		list.set(2, "Android");
		System.out.println("인덱스 2를 Android로 교체 후: " + list);
		
		// 6. 데이터 포함 여부 확인 (contains)
		System.out.println("MySQL 포함 여부: " + list.contains("MySQL"));
		
		// 7. 특정 데이터의 인덱스 찾기 (indexOf)
		System.out.println("MySQL의 위치(인덱스): " + list.indexOf("MySQL"));
		
		// 8. 리스트가 비어있는지 확인 (isEmpty)
		System.out.println("리스트가 비었는가? " + list.isEmpty());
		
		System.out.println("---------------------------------------------");
		
		// --- 리스트의 데이터를 꺼내는(순회하는) 방법 ---
		
		// 방법 1: 일반 for문과 인덱스 번호(get) 사용
		System.out.println("방법 1: 일반 for문");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		System.out.println("--------------------");
		
		// 방법 2: 향상된 for문 (For-Each) - 인덱스가 필요 없을 때 권장
		System.out.println("방법 2: 향상된 for문");
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("--------------------");
		
		// 방법 3: Iterator(반복자) 사용 - 컬렉션 구조에 상관없이 일관된 방식으로 데이터 접근 가능
		System.out.println("방법 3: Iterator 사용");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) { // 다음에 꺼낼 데이터가 있는지 확인
			System.out.println(it.next()); // 데이터를 꺼내오고 다음으로 이동
		}
	}

}










