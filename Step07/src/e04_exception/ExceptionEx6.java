package e04_exception;

import java.util.Scanner;

public class ExceptionEx6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("숫자 입력 : ");
			int n1 = sc.nextInt();
			System.out.print("숫자 입력 : ");
			int n2 = sc.nextInt();
			
			if(n2 == 0)
				throw new UserException("0으로 나눌수 없습니다.");//원하는 시점에서 Exception을 강제로 발생 
			
			System.out.println(n1 / n2);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(plus(56,10));
		} catch (UserException e) {
			e.printStackTrace();
		}
		
	}
	public static int plus(int n1, int n2) throws UserException {
		if(n1 == 0)
			throw new UserException("n1에 0을 입력하지 마세요");
		return n1 + n2;
	}
}	











