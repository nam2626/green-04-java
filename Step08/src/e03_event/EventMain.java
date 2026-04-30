package e03_event;

import e03_event.View.OnClikeListener;

/**
 * 이벤트 처리 방식을 테스트하는 메인 클래스
 * 인터페이스 구현 클래스, 익명 클래스, 람다식을 이용한 세 가지 방식을 비교합니다.
 */
public class EventMain {

	public static void main(String[] args) {
		// 1. 인터페이스를 구현한 별도의 클래스(ButtonRegisterOnClickListener)를 사용하는 방식
		Button btnRegister = new Button("회원가입");
		ButtonRegisterOnClickListener clickEvent = new ButtonRegisterOnClickListener();
		btnRegister.setClickListener(clickEvent);
		btnRegister.onClick();
		
		String id = "admin";
		
		// 2. 익명 클래스를 사용하여 즉석에서 인터페이스를 구현하는 방식
		Button btnLogin = new Button("로그인");
		btnLogin.setClickListener(new View.OnClikeListener() {
			
			@Override
			public void onClick(View view) {
				System.out.println(view.getName() + " 버튼 클릭");
				System.out.println(id + " 로그인 처리 합니다.");
			}
		});
		btnLogin.onClick();
		
		// 3. 람다식(Lambda)을 사용하여 코드를 더욱 간결하게 표현하는 방식 (함수형 인터페이스일 때 가능)
		Button btnCancel = new Button("취소");
		btnCancel.setClickListener(view -> {
			System.out.println(view.getName() + " 버튼 클릭");
			System.out.println("취소 처리 합니다.");
		});
		btnCancel.onClick(); // 실제 호출이 빠져있어 추가함
		
	}

}
