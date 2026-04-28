package controller;

import java.util.Scanner;

import service.StudentService;

public class StudentDeleteController extends Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 삭제를 시작합니다....");

		System.out.print("삭제할 학생의 학번 : ");
		String no = sc.nextLine();
		
		if(StudentService.getInstance().deleteStudentVO(no)){
			System.out.println("학생정보 삭제가 완료되었습니다.");
		}else {
			System.out.println("삭제할 학생 정보가 없습니다.");
		}
			
		
		
	}
}







