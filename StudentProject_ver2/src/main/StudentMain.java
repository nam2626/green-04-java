package main;

import java.util.Scanner;

import controller.Controller;
import controller.HandlerMapping;

/**
 * 학적관리 프로그램의 실행을 담당하는 메인 클래스
 */
public class StudentMain {

	public static void main(String[] args) {
		// 입력을 위한 Scanner와 기능을 처리할 StudentService 객체 생성
		Scanner sc = new Scanner(System.in);
		
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
			//HandlerMapping에서 메뉴 번호에 해당하는 컨트롤러를 생성해서 받음
			Controller controller = HandlerMapping.getInstance().createController(no);
			//Controller가 null이 아닐때 작업 시작
			if(controller != null)
				controller.execute(sc);
			else
				System.out.println("메뉴 번호를 확인해 주세요");
		}
		
		sc.close(); // 자원 반납
	}

}
