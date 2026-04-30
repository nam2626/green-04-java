package e03_event;

/**
 * 인터페이스를 구현한 이벤트 리스너 클래스
 */
public class ButtonRegisterOnClickListener implements View.OnClikeListener {

	@Override
	public void onClick(View view) {
		// 클릭 이벤트 발생 시 실행될 로직 정의
		System.out.println(view.getName() + " 버튼 클릭");
		System.out.println("회원 가입 처리를 진행합니다.");
	}

}
