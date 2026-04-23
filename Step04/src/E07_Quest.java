import java.util.Arrays;

/**
 * [문제 1] 짝수의 평균 구하기
 * 길이가 10인 배열에 1~100 사이의 랜덤 숫자를 채우고, 짝수들만의 합계와 평균을 계산합니다.
 */
public class E07_Quest {
    public static void main(String[] args) {
        // 1. 길이가 10인 정수형 배열 생성
        int[] arr = new int[10];
        int sum = 0;   // 짝수 합계용
        int count = 0; // 짝수 개수 카운트용

        // 2. 랜덤 값 채우기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100) + 1;
        }
        System.out.println("생성된 배열: " + Arrays.toString(arr));

        // 3. 짝수 판별 및 합산
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
                count++;
            }
        }

        // 4. 결과 출력 (평균 계산 시 0으로 나누는 예외 방지)
        if (count > 0) {
            double avg = (double)sum / count;
            System.out.println("짝수 합계: " + sum);
            System.out.println("짝수 개수: " + count);
            System.out.println("짝수 평균: " + avg);
        } else {
            System.out.println("배열에 짝수가 하나도 없습니다.");
        }
    }
}
