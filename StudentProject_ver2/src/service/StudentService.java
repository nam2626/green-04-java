package service;

import java.util.Scanner;

import vo.StudentVO;

/**
 * 학생 데이터를 관리(저장, 검색)하는 핵심 서비스 클래스
 * 싱글톤 패턴을 적용하여 프로그램 전체에서 동일한 데이터 저장소(arr)를 공유함
 */
public class StudentService {
	// 자기 자신의 인스턴스를 하나만 생성하여 유지함
	private static StudentService instance = new StudentService();
	
	// 데이터 저장용 배열과 현재 개수 관리 변수
	private StudentVO[] arr; 
	private int idx;         

	/**
	 * 외부에서 직접 객체 생성을 못하도록 생성자를 private으로 설정
	 */
	private StudentService() {
		arr = new StudentVO[20]; // 최대 20명 저장 가능
		
		// 테스트용 샘플 데이터 초기화
		arr[idx++] = new StudentVO("20230001", "홍길동", "컴퓨터공학과", 4.5);
		arr[idx++] = new StudentVO("20230002", "김철수", "경영학과", 3.8);
		arr[idx++] = new StudentVO("20230003", "이영희", "심리학과", 3.2);
		arr[idx++] = new StudentVO("20230004", "박영수", "생활체육학과", 4.0);
		arr[idx++] = new StudentVO("20230005", "최민수", "전자공학과", 3.5);	
	}

	/**
	 * 어디서든 동일한 서비스 객체에 접근할 수 있도록 인스턴스를 반환하는 메서드
	 */
	public static StudentService getInstance() {
		if(instance == null)
			instance = new StudentService();
		return instance;
	}
	
	/**
	 * 컨트롤러에서 데이터를 읽어갈 수 있도록 배열 참조를 반환함
	 */
	public StudentVO[] getArr() {
		return arr;
	}
	
	/**
	 * 학번으로 학생 존재 여부를 확인하는 인덱스 검색 메서드
	 */
	public int searchStudentVO(String no) {
		for(int i=0;i<idx;i++) {
			if(arr[i].getNo().equals(no))
				return i; 
		}
		return -1; 
	}
	
	/**
	 * 전달받은 학생 VO 객체를 배열의 빈 공간에 추가함
	 */
	public boolean appendStudentVO(StudentVO vo) {
		if(idx == arr.length) {
			return false;
		}
		arr[idx++] = vo;
		return true;
	}
	
	// --- 아래 기능들은 아직 컨트롤러로 분리되지 않은 상태입니다 ---
	
	public void updateStudentVO(Scanner sc) {
		// (기존 수정 로직 유지...)
	}
	
	public void deleteStudentVO(Scanner sc) {
		// (기존 삭제 로직 유지...)
	}

	public void searchStudentVO(Scanner sc) {
		// (기존 검색 로직 유지...)
	}
}
