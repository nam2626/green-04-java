package service;

import java.util.Scanner;

import vo.StudentVO;

/**
 * 학생 관리 기능을 제공하는 서비스 클래스 (싱글톤 패턴 적용)
 */
public class StudentService {
	private static StudentService instance = new StudentService();
	
	// 필드
	private StudentVO[] arr; // 학생 정보를 저장할 배열
	private int idx;         // 현재 저장된 학생 수 및 다음 저장될 인덱스

	public static StudentService getInstance() {
		if(instance == null)
			instance = new StudentService();
		return instance;
	}
	
	/**
	 * 기본 생성자 - 배열 초기화 및 샘플 데이터 생성
	 */
	private StudentService() {
		arr = new StudentVO[20]; // 최대 20명 저장 가능
		
		// 샘플 데이터 5건 생성해서 배열에 저장
		arr[idx++] = new StudentVO("20230001", "홍길동", "컴퓨터공학과", 4.5);
		arr[idx++] = new StudentVO("20230002", "김철수", "경영학과", 3.8);
		arr[idx++] = new StudentVO("20230003", "이영희", "심리학과", 3.2);
		arr[idx++] = new StudentVO("20230004", "박영수", "생활체육학과", 4.0);
		arr[idx++] = new StudentVO("20230005", "최민수", "전자공학과", 3.5);	
	}
	
	/**
	 * 등록된 모든 학생 정보를 출력하는 메서드
	 */
	public void printAllStudentVO() {
		System.out.println("전체 학생정보를 조회합니다.............");
		for (int i = 0; i < idx; i++) {
			arr[i].printInfo();
		}
	}
	
	/**
	 * 특정 학번을 가진 학생의 인덱스를 검색하는 메서드
	 * @param no 검색할 학번
	 * @return 검색 결과 인덱스 (-1 : 없음, 0 이상 : 해당 인덱스) 
	 */
	public int searchStudentVO(String no) {
		for(int i=0;i<idx;i++) {
			if(arr[i].getNo().equals(no))
				return i; // 학번이 일치하는 위치 반환
		}
		return -1; // 찾지 못한 경우
	}
	
	/**
	 * 새로운 학생 정보(객체)를 배열에 추가하는 메서드
	 */
	public boolean appendStudentVO(StudentVO vo) {
		// 저장 공간 확인
		if(idx == arr.length) {
			System.out.println("더 이상 저장할 공간이 없습니다.");
			return false;
		}

		// StudentVO 객체 배열 추가
		arr[idx++] = vo;
		return true;
	}
	
	/**
	 * 기존 학생 정보를 수정하는 메서드
	 */
	public void updateStudentVO(Scanner sc) {
		System.out.println("학생정보 수정을 시작합니다....");
		
		System.out.print("수정할 학생의 학번 : ");
		String no = sc.nextLine();
		
		int i = searchStudentVO(no);
		
		if(i == -1) {
			System.out.println("수정할 학생정보가 없습니다.");
			return;
		}
		
		System.out.print("수정할 학생의 이름 : ");
		String name = sc.nextLine();
		System.out.print("수정할 학생의 학과명 : ");
		String majorName = sc.nextLine();
		System.out.print("수정할 학생의 평점 : ");
		double score = sc.nextDouble(); 
		sc.nextLine(); 
		
		arr[i].updateStudentVO(name, majorName, score);
		System.out.println("학생정보 수정이 완료되었습니다.");
	}
	
	/**
	 * 학생 정보를 배열에서 삭제하는 메서드
	 */
	public void deleteStudentVO(Scanner sc) {
		System.out.println("학생정보 삭제를 시작합니다....");
		
		System.out.print("삭제할 학생의 학번 : ");
		String no = sc.nextLine();
		int i = searchStudentVO(no);
		
		if(i == -1) {
			System.out.println("삭제할 학생정보가 없습니다.");
			return;
		}
		
		for(int j=i; j < idx-1; j++) {
			arr[j] = arr[j+1];
		}
		
		arr[idx-1] = null; 
		idx--;
		System.out.println("학생정보 삭제가 완료되었습니다.");
	}

	/**
	 * 학생 이름을 키워드로 검색하여 해당 정보를 출력하는 메서드
	 */
	public void searchStudentVO(Scanner sc) {
		System.out.println("학생정보 조회 작업을 시작합니다......");
		
		System.out.print("조회할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		int count = 0; 
		
		for(int i=0; i < idx; i++) {
			if(arr[i].getName().indexOf(name) != -1) {
				arr[i].printInfo();
				count++;
			}
		}
		
		System.out.println("총 " + count + "건 조회되었습니다.");
	}
}
