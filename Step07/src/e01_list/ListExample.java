package e01_list;

import java.util.ArrayList;

public class ListExample {
	/*
	 * 	List 특징
	 * 		1. 데이터 중복
	 * 		2. 리스트에 저장된 데이터 순서가 보장됨
	 * 
	 *  ArrayList : 리스트에서 데이터를 배열로 관리
	 *  LinkedList : 리스트에서 데이터를 노드 단위로 노드끼리 연결해서 관리
	 *  Vector : ArrayList와 동일	, 동기화가 추가
	 * 
	 */
	public static void main(String[] args) {
		//문자열만 저장하는 리스트를 생성
		ArrayList<String> list = new ArrayList<String>();
		//데이터 추가
		list.add("HTML/CSS");
		list.add("javascript");
		list.add("React");
		list.add("MySQL");
		list.add("jsp/Servlet");
		list.add("Spring");
		list.add("MySQL");
		list.add("RTOS");

		System.out.println(list);
		//데이터 삭제
		list.remove(1);
		System.out.println(list);
		list.remove("MySQL");//최초 검색된 데이터만 삭제
		System.out.println(list);
		//리스트가 저장하고 있는 데이터 개수
		System.out.println(list.size());
		//리스트의 특정 인덱스에다가 데이터를 삽입
		list.add(2, "Kotlin");
		System.out.println(list);
		//리스트의 특정 인덱스에다가 데이터를 교체
		list.set(2, "Android");
		System.out.println(list);
		
	}

}










