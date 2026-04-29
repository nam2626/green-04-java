package controller;

import java.util.Scanner;

/**
 * 모든 컨트롤러 클래스의 공통 규격을 정의하는 인터페이스
 * 사용자의 요청을 처리하는 execute 메서드를 정의함
 */
public interface Controller {
	/**
	 * 기능을 수행하는 메서드
	 * @param sc 사용자 입력을 받기 위한 Scanner 객체
	 */
	public void execute(Scanner sc) ;
}
