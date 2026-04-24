package service;

import vo.StudentVO;

public class StudentService {
	//필드
	//StudentVO를 배열로 선언
	private StudentVO[] arr;
	private int idx;

	//기본생성자 - 필드 초기화
	public StudentService() {
		arr = new StudentVO[20];
		
		//샘플데이터 5건 생성해서 배열에 저장
		arr[idx++] = new StudentVO("20230001", "홍길동", "컴퓨터공학과", 4.5);
		arr[idx++] = new StudentVO("20230002", "김철수", "경영학과", 3.8);
		arr[idx++] = new StudentVO("20230003", "이영희", "심리학과", 3.2);
		arr[idx++] = new StudentVO("20230004", "박영수", "생활체육학과", 4.0);
		arr[idx++] = new StudentVO("20230005", "최민수", "전자공학과", 3.5);	
	}
	
	//1. 학생정보 전체 출력
	
	//2. 학생정보 추가
	
	//3. 학생정보 수정
	
	//4. 학생정보 삭제
	
	//5. 학생정보 검색
	
	
	
}








