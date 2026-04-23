import java.util.Scanner;

public class E05_Switch {
	/*
	 * 		밀크 커피			설탕 커피			블랙 커피
	 * 			프림 추가			설탕 추가			커피 추가
	 * 			설탕 추가			커피 추가			뜨거운 물			
	 * 			커피 추가			뜨거운 물
	 * 			뜨거운 물
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 밀크 커피");
		System.out.println("2. 설탕 커피");
		System.out.println("3. 블랙 커피");
		System.out.print("원하시는 번호를 입력하세요 : ");
		int no = sc.nextInt();//숫자 입력 받는 부분
		
		switch(no) {
		case 1:
			System.out.println("프림 추가");
		case 2:
			System.out.println("설탕 추가");
		case 3:
			System.out.println("커피 추가");
			System.out.println("뜨거운물 추가");
		}
		
	}

}


















