import java.util.Scanner;
import java.util.Arrays;

/**
 * [문제 3] 간이 좌석 예약 시스템
 * 배열을 좌석으로 활용하여 예약 상태(0:빈석, 1:예약석)를 관리합니다.
 */
public class E09_Quest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 10개의 좌석 생성 (0으로 자동 초기화됨)
        int[] seats = new int[10];

        while (true) {
            System.out.println("---------------------------");
            System.out.println("현재 좌석 상태: " + Arrays.toString(seats));
            System.out.print("예약할 좌석 번호(1~10) 입력 (종료는 -1): ");
            int choice = sc.nextInt();

            // 종료 조건
            if (choice == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 범위 체크
            if (choice < 1 || choice > 10) {
                System.out.println("잘못된 좌석 번호입니다. (1~10 사이 입력)");
                continue;
            }

            // 예약 로직 (사용자 입력값 - 1을 인덱스로 사용)
            int index = choice - 1;
            if (seats[index] == 0) {
                seats[index] = 1; // 예약 완료
                System.out.println(choice + "번 좌석이 예약되었습니다.");
            } else {
                System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택하세요.");
            }
        }

        // 최종 상태 출력
        System.out.println("최종 예약 현황: " + Arrays.toString(seats));
        sc.close();
    }
}
