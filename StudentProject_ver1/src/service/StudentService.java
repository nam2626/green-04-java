package service;

import java.util.Scanner;

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
	
	/**
	 * 학생정보 전체 출력
	 */
	public void printAllStudentVO() {
		System.out.println("전체 학생정보를 조회합니다.............");
		for (int i = 0; i < idx; i++) {
			arr[i].printInfo();
		}
	}
	/**
	 * 학생정보 추가
	 * @param sc 입력을 담당할 객체
	 */
	public void appendStudentVO(Scanner sc) {
		System.out.println("학생정보등록을 시작합니다......");
		// 더 이상 입력할 공간이 없으면 해당 메서드를 종료
		if(idx == arr.length) {
			System.out.println("더 이상 저장할 공간이 없습니다.");
			return;
		}
		
		// 1. 학생정보 입력 받음.
		System.out.print("등록할 학생의 학번 : ");
		String no = sc.nextLine();
		System.out.print("등록할 학생의 이름 : ");
		String name = sc.nextLine();
		System.out.print("등록할 학생의 학과명 : ");
		String majorName = sc.nextLine();
		System.out.print("등록할 학생의 평점 : ");
		double score = sc.nextDouble();
		sc.nextLine();

		//2. 배열에 입력한 학생정보를 기준으로 StudentVO 객체 생성해서 추가
		arr[idx++] = new StudentVO(no, name, majorName, score);
	}
	//3. 학생정보 수정
	
	//4. 학생정보 삭제
	
	//5. 학생정보 검색
	
	
	
}








