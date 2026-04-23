/**
 * 이 클래스는 배열(Array)의 기초 개념과 생성 방법을 학습하는 예제입니다.
 */
public class E01_ArryaEx1 {
	/*
	 * 배열(Array)
	 *   - 하나의 변수명으로 동일한 타입의 여러 값을 저장할 공간을 만드는 자료구조입니다.
	 *   - 연속된 메모리 공간에 데이터가 저장됩니다.
	 *
	 * 인덱스(Index)
	 *   - 배열의 요소에 접근하기 위한 번호표로, 항상 0부터 시작합니다.
	 *   - 인덱스의 범위: 0 ~ (배열 길이 - 1)
	 *
	 * 배열 생성 방법:
	 *   - 변수타입[] 변수명 = new 변수타입[개수];
	 */
	public static void main(String[] args) {
		// 1. 길이가 5인 정수형(int) 배열 생성
		int[] arr = new int[5];
		
		// 2. 데이터 초기화 (인덱스를 사용하여 각 공간에 값 대입)
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		// [주의] 인덱스 범위를 벗어나면 ArrayIndexOutOfBoundsException 발생 (런타임 에러)
		// arr[5] = 100; // 문법 오류는 아니지만 실행 시 에러 발생
		
		// 3. 배열 데이터 출력
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		System.out.println("arr[2] : " + arr[2]);
		System.out.println("arr[3] : " + arr[3]);
		System.out.println("arr[4] : " + arr[4]);
	}
}
