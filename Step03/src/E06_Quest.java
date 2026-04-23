/**
 * 이 클래스는 성적(점수)에 따라 등급을 나누는 연습 예제입니다.
 */
public class E06_Quest {
	/*
	 * 문제: 0~100 사이의 랜덤한 점수를 생성하고, 다음 기준에 따라 학점을 출력하세요.
	 * 90점 이상 : A
	 * 80점 이상 : B
	 * 70점 이상 : C
	 * 60점 이상 : D
	 * 나머지 : F
	 */
	public static void main(String[] args) {
		// 0~100 사이의 랜덤 점수 생성
		int n = (int)Math.floor(Math.random() * 101);
		System.out.println("점수 : " + n);
		
		
	}
}



