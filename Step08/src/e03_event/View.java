package e03_event;

/**
 * UI 구성 요소의 기본 클래스
 */
public class View {
	protected String name; // 뷰의 이름
	private OnClikeListener clickListener; // 클릭 이벤트 리스너 인터페이스 타입의 변수
	
	public View(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	/**
	 * 외부에서 클릭 이벤트를 처리할 수 있도록 리스너를 등록하는 메서드
	 */
	public void setClickListener(OnClikeListener clickListener) {
		this.clickListener = clickListener;
	}
	
	/**
	 * 실제 클릭이 발생했을 때 호출되는 메서드
	 * 등록된 리스너가 있다면 리스너의 onClick 메서드를 실행합니다.
	 */
	public void onClick() {
		if(clickListener != null)
			clickListener.onClick(this);
	}
	
	/**
	 * 클릭 이벤트를 정의하기 위한 내부 인터페이스 (함수형 인터페이스)
	 */
	public static interface OnClikeListener{
		public void onClick(View view);
	}

}
