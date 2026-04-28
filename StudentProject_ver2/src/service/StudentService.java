package service;

import java.util.Scanner;

import vo.StudentVO;

/**
 * 학생 데이터를 관리(저장, 검색)하는 핵심 서비스 클래스 싱글톤 패턴을 적용하여 프로그램 전체에서 동일한 데이터 저장소(arr)를 공유함
 */
public class StudentService {
	// 자기 자신의 인스턴스를 하나만 생성하여 유지함 (싱글톤)
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
		if (instance == null)
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
	 * 
	 * @param no 검색할 학번
	 * @return 찾으면 배열 인덱스, 못 찾으면 -1
	 */
	public int searchStudentVO(String no) {
		for (int i = 0; i < idx; i++) {
			if (arr[i].getNo().equals(no))
				return i;
		}
		return -1;
	}

	/**
	 * 새로운 학생 정보(객체)를 배열의 빈 공간에 추가함
	 */
	public boolean appendStudentVO(StudentVO vo) {
		if (idx == arr.length) {
			System.out.println("더 이상 저장할 공간이 없습니다.");
			return false;
		}
		arr[idx++] = vo;
		return true;
	}

	/**
	 * 기존 학생 정보를 수정하는 메서드 (기능 이전 전까지 서비스에서 유지)
	 */
	public void updateStudentVO(Scanner sc) {
		System.out.println("학생정보 수정을 시작합니다....");

		System.out.print("수정할 학생의 학번 : ");
		String no = sc.nextLine();

		int i = searchStudentVO(no);

		if (i == -1) {
			System.out.println("수정할 학생정보가 없습니다.");
			return;
		}

		System.out.print("수정할 학생의 이름 : ");
		String name = sc.nextLine();
		System.out.print("수정할 학생의 학과명 : ");
		String majorName = sc.nextLine();
		System.out.print("수정할 학생의 평점 : ");
		double score = sc.nextDouble();
		sc.nextLine(); // 버퍼 비우기

		arr[i].updateStudentVO(name, majorName, score);
		System.out.println("학생정보 수정이 완료되었습니다.");
	}

	/**
	 * 학생 정보를 배열에서 삭제하는 메서드 (기능 이전 전까지 서비스에서 유지)
	 */
	public boolean deleteStudentVO(String no) {

		// 삭제할 학생 정보가 있는지? 확인
		int i = StudentService.getInstance().searchStudentVO(no);

		if (i == -1) 
			return false;

		// 한 칸씩 당겨서 빈 공간 메우기
		for (int j = i; j < idx - 1; j++) {
			arr[j] = arr[j + 1];
		}

		arr[idx - 1] = null;
		idx--;
		
		return true;
	}

	/**
	 * 학생 이름을 키워드로 검색하여 정보를 출력하는 메서드 (기능 이전 전까지 서비스에서 유지)
	 */
	public void searchStudentVO(Scanner sc) {
		System.out.println("학생정보 조회 작업을 시작합니다......");

		System.out.print("조회할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();

		int count = 0;

		for (int i = 0; i < idx; i++) {
			if (arr[i].getName().indexOf(name) != -1) {
				arr[i].printInfo();
				count++;
			}
		}

		System.out.println("총 " + count + "건 조회되었습니다.");
	}
}
