/**
 * 이 클래스는 switch-case 문의 기본적인 구조와 break의 역할을 설명합니다.
 */
public class E04_Switch {
	
	public static void main(String[] args) {
		int no = 5;
		
		/*
		 * switch(변수): 변수의 값에 따라 일치하는 case로 이동합니다.
		 * break: 현재 switch 문을 빠져나오게 합니다. break가 없으면 다음 case들을 계속 실행합니다.
		 * default: 어떠한 case와도 일치하지 않을 때 실행됩니다. (if문의 else와 비슷)
		 */
		switch(no) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("???");
		}
	}
}
