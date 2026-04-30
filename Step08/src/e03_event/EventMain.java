package e03_event;

import e03_event.View.OnClikeListener;

public class EventMain {

	public static void main(String[] args) {
		Button btnRegister = new Button("회원가입");
		ButtonRegisterOnClickListener clickEvent = new ButtonRegisterOnClickListener();
		btnRegister.setClickListener(clickEvent);
		btnRegister.onClick();
		
		String id = "admin";
		Button btnLogin = new Button("로그인");
		btnLogin.setClickListener(new View.OnClikeListener() {
			
			@Override
			public void onClick(View view) {
				System.out.println(view.getName()+ "버튼 클릭");
				System.out.println(id + " 로그인 처리 합니다.");
			}
		});
		btnLogin.onClick();
		// 람다 적용시
		Button btnCancel = new Button("취소");
		btnCancel.setClickListener(view -> {
			System.out.println(view.getName()+ "버튼 클릭");
			System.out.println("취소 처리 합니다.");
		});
		
	}

}
