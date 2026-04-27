package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

/**
 * 모든 학생 정보를 출력하는 컨트롤러
 */
public class StudentAllPrintController extends Controller {
	@Override
	public void execute(Scanner sc) {
		// 서비스로부터 전체 학생 배열을 받아옴
		StudentVO[] arr = StudentService.getInstance().getArr();
		
		System.out.println("전체 학생정보를 조회합니다.............");
		for (StudentVO vo : arr) {
			// 배열의 끝이거나 비어있는 경우 출력 중단
			if(vo == null) break;
			vo.printInfo();			
		}
	}
}
