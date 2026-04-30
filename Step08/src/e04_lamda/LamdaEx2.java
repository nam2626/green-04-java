package e04_lamda;

import e03_event.Button;

/**
 * 람다식을 매개변수로 전달하는 예제
 */
public class LamdaEx2 {
	/**
	 * Calcurator 인터페이스를 매개변수로 받는 메서드
	 */
	public static void calc(int x, int y, Calcurator calc) {
		System.out.println("계산 결과: " + calc.calc(x, y));
	}
	
	public static void main(String[] args) {
		// 메서드 호출 시 직접 람다식을 작성하여 전달할 수 있습니다.
		calc(10, 4, (x, y) -> x + y);
		
		// 버튼 클릭 이벤트에 람다식 적용 예제
		Button btnOK = new Button("확인");
		btnOK.setClickListener(v -> System.out.println(v.getName() + " 버튼 클릭됨 (람다)"));
		btnOK.onClick();
	}

}
