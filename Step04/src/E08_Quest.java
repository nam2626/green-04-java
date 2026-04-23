import java.util.Arrays;

/**
 * [문제 2] 주사위 빈도수 측정
 * 주사위를 20번 던져서 각 눈(1~6)이 나온 횟수를 배열을 사용하여 카운팅합니다.
 */
public class E08_Quest {
    public static void main(String[] args) {
        // 1. 주사위 결과(20번)를 저장할 배열
        int[] rolls = new int[20];
        // 2. 각 눈의 빈도수(1~6)를 저장할 배열 (인덱스 0은 1의 개수, ..., 인덱스 5는 6의 개수)
        int[] counts = new int[6];

        // 3. 주사위 20번 던지기
        for (int i = 0; i < rolls.length; i++) {
            rolls[i] = (int)(Math.random() * 6) + 1;
            
            // 핵심 로직: 나온 주사위 눈을 인덱스로 활용하여 카운트 증가
            // 예: 눈이 3이면 counts[2]를 1 증가시킴
            counts[rolls[i] - 1]++;
        }

        // 4. 결과 출력
        System.out.println("주사위 결과: " + Arrays.toString(rolls));
        System.out.println("--- 빈도수 결과 ---");
        for (int i = 0; i < counts.length; i++) {
            System.out.println((i + 1) + "의 개수: " + counts[i] + "번");
        }
    }
}
