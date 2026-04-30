package e04_lamda;

import e03_event.Button;

public class LamdaEx2 {
	public static void calc(int x, int y, Calcurator calc) {
		System.out.println(calc.calc(x, y));
	}
	
	public static void main(String[] args) {
		calc(10,4,(x,y) -> x+y);
		
		Button btnOK = new Button("확인");
		btnOK.setClickListener(v -> System.out.println(v.getName() + " 버튼 클릭"));
		btnOK.onClick();
	}

}






