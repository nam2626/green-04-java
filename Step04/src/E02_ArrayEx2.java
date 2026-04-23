/**
 * 이 클래스는 배열의 다양한 초기화 방법과 반복문을 이용한 접근법을 학습하는 예제입니다.
 */
public class E02_ArrayEx2 {

	public static void main(String[] args) {
		// 1. 배열 생성과 동시에 초기화 하는 방법 (가장 많이 사용)
		// 별도의 new int[] 문구 없이 값을 직접 나열합니다.
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
		
		// .length 속성: 배열의 전체 길이를 반환합니다.
		System.out.println("arr1 배열 길이 : " + arr1.length);
		
		// 2. 일반 for문을 이용한 배열 요소 출력
		// 인덱스 i를 0부터 length-1까지 증가시키며 접근합니다.
		System.out.print("일반 for문 출력 : ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		// 3. 배열 생성과 동시에 초기화 하는 방법 2 (new 키워드 명시)
		// 선언과 할당을 분리해야 할 때 주로 사용합니다.
		int[] arr2 = new int[]{10, 11, 12, 13, 14};
		
		// 4. 향상된 for문 (Enhanced for-each loop)
		// 인덱스를 직접 다루지 않고 배열의 각 요소를 하나씩 변수(num)에 담아 반복합니다.
		// 가독성이 좋고 인덱스 실수를 방지할 수 있습니다.
		System.out.print("향상된 for문 출력 : ");
		for (int num : arr2) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
