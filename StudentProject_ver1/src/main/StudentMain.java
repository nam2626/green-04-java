package main;

import java.util.Scanner;

import service.StudentService;

/**
 * 학적관리 프로그램의 실행을 담당하는 메인 클래스
 */
public class StudentMain {

	public static void main(String[] args) {
		// 입력을 위한 Scanner와 기능을 처리할 StudentService 객체 생성
		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();
		
		// 무한 루프를 통해 메뉴 시스템 구현
		while(true) {
			System.out.println("-- 학적관리 프로그램 --");
			System.out.println("1. 학생정보 등록");
			System.out.println("2. 학생정보 삭제");
			System.out.println("3. 학생정보 수정");
			System.out.println("4. 학생정보 조회");
			System.out.println("5. 전체 학생정보 조회");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하시는 메뉴번호를 입력하세요 : ");
			
			int no = sc.nextInt(); 
			sc.nextLine(); // 입력 버퍼에 남아있는 개행 문자 제거
			
			// 0번 입력 시 프로그램 종료
			if(no == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			// 메뉴 번호에 따른 기능 수행
			switch(no) {
			case 1:
				// 학생 정보 등록 기능 호출
				service.appendStudentVO(sc);
				break;
			case 2:
				// 학생 정보 삭제 기능 호출
				service.deleteStudentVO(sc);
				break;
			case 3:
				// 학생 정보 수정 기능 호출
				service.updateStudentVO(sc);
				break;
			case 5:
				// 전체 학생 목록 출력 기능 호출
				service.printAllStudentVO();
				break;
			default:
				System.out.println("잘못된 메뉴 번호입니다. 다시 입력해주세요.");
				break;
			}
		}
		
		sc.close(); // 자원 반납
	}

}







