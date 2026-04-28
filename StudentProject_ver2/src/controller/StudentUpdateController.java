package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class StudentUpdateController extends Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 수정을 시작합니다....");

		System.out.print("수정할 학생의 학번 : ");
		String no = sc.nextLine();
		
		StudentVO vo = StudentService.getInstance().searchStudentVO2(no);
		
		if(vo == null) {
			System.out.println("수정할 학생 정보가 없습니다.");
			return;
		}
			
		System.out.print("수정할 학생의 이름 : ");
		String name = sc.nextLine();
		System.out.print("수정할 학생의 학과명 : ");
		String majorName = sc.nextLine();
		System.out.print("수정할 학생의 평점 : ");
		double score = sc.nextDouble();
		sc.nextLine(); // 버퍼 비우기

		vo.updateStudentVO(name, majorName, score);
		System.out.println("학생정보 수정이 완료되었습니다.");
	
	}
}







