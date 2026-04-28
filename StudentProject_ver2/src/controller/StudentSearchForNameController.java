package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class StudentSearchForNameController extends Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 조회 작업을 시작합니다......");

		System.out.print("조회할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();

		StudentVO vo = StudentService.getInstance().searchStudentVOForName(name);
		
		if(vo == null)
			System.out.println("해당 검색결과가 없습니다.");
		else
			vo.printInfo();
		
	}
}






