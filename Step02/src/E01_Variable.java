
public class E01_Variable {
	/*
	 * 	데이터 
	 * 		정수 : 양수, 음수, 0
	 * 		실수 : 정수에서 소수점 추가된 형태
	 * 		문자 : 한글자
	 * 		문자열 : 문자가 한개 이상으로 구성된 형태
	 * 		논리 : 참(true), 거짓(false)
	 * 
	 *	변수 선언 방법
	 *		변수타입 변수명;
	 * 
	 */
	public static void main(String[] args) {
		//변수 선언 방법 - 1
		int num; //num이라는 이름으로 정수형 데이터를 하나 저장할 공간을 임대 받았다.
		num = 100;//100을 num에 저장
		System.out.println(num);//num이 저장하고 있는 100을 읽어와서 화면에 출력
		
		//변수 선언 방법 - 2
		int num1 = 100;//초기화(initialize) : 변수를 선언한 뒤에 처음 값을 저장하는 행위
		int num2 = 200, num3 = 300; // 변수 두개를 동일한 타입으로 선언 후 초기화하는 행위

		System.out.println(num1 + num2 + num3);
		
		int n = 10;
		n = num1 = num2 = 30000;
		System.out.println(n);
		
	}

}














