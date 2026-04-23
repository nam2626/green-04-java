import java.util.Arrays;

/**
 * 이 클래스는 다양한 자료형의 배열 생성 시 기본 초기화 값을 확인하는 예제입니다.
 */
public class E03_ArrayEx3 {

	public static void main(String[] args) {
		// 자바의 배열은 생성 시 각 자료형의 기본값(default value)으로 자동 초기화됩니다.
        int[] arr1 = new int[4];      // 정수형: 0으로 초기화
        double[] arr2 = new double[4]; // 실수형: 0.0으로 초기화
        char[] arr3 = new char[4];     // 문자형: '\u0000' (공백)으로 초기화
        boolean[] arr4 = new boolean[4]; // 논리형: false로 초기화
        String[] arr5 = new String[4];   // 참조형(문자열 등): null로 초기화

        // Arrays.toString(배열명) : 배열의 모든 요소를 문자열 형태로 반환하여 출력 시 유용합니다.
        System.out.println("int 배열 : " + Arrays.toString(arr1));
        System.out.println("double 배열 : " + Arrays.toString(arr2));
        System.out.println("char 배열 : " + Arrays.toString(arr3));
        System.out.println("boolean 배열 : " + Arrays.toString(arr4));
        System.out.println("String 배열 : " + Arrays.toString(arr5));
	}
}
