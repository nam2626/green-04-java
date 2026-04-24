package main;

import java.util.Scanner;

import service.StudentService;


public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();
		
		while(true) {
			System.out.println("-- 학적관리 프로그램 --");
			System.out.println("1. 학생정보 등록");
			System.out.println("2. 학생정보 삭제");
			System.out.println("3. 학생정보 수정");
			System.out.println("4. 학생정보 조회");
			System.out.println("5. 전체 학생정보 조회");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하시는 메뉴번호를 입력하세요 : ");
			int no = sc.nextInt(); sc.nextLine();
			
			if(no == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			switch(no) {
			case 1:
				service.appendStudentVO(sc);
				break;
			case 5:
				service.printAllStudentVO();
				break;
			}
		}
	}

}







