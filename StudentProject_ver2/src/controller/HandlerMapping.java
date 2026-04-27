package controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {	}

	public static HandlerMapping getInstance() {
		if(instance == null)
			instance = new HandlerMapping();
		return instance;
	}
	/*
	 * 메뉴 번호에 해당하는 작업을 하는 컨트롤러 생성해서 리턴하는 메서드
	 */
	public Controller createController(int no) {
		Controller controller = null;
		switch(no) {
		case 1:
			controller = new StudentInsertController();
			break;
		case 5:
			controller = new StudentAllPrintController();
			break;
		}
		return controller;
	}
}
