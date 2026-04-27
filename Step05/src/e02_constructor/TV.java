package e02_constructor;
/**
 * TV 클래스
 * 	1. 필드
 * 		채널(1~480), 볼륨(0~50), 
 * 		전원(true,false), 음소거(true,false)
 * 	2. 메서드
 * 		채널UP, 채널DOWN, 볼륨UP, 볼륨DOWN
 * 		전원OnOff, 음소거OnOff
 */
public class TV {
	//1. 필드
	private int ch;
	private int vol;
	private boolean power;
	private boolean mute;
	//2. 기본 생성자(원하시는 값으로 초기화)
	public TV() {
		ch = 24;
		vol = 15;
		power = mute = false;
	}
	//전원OnOff
	public void powerOnOff() {
		//powerOnOff를 실행할 때마다 전원값이 바껴야함
		power = !power;
		//전원이 true면 TV 전원이 켜졌습니다.
		if(power) System.out.println("TV 전원이 켜졌습니다.");
		//전원이 false면 TV 전원이 꺼졌습니다.
		else System.out.println("TV 전원이 꺼졌습니다.");
	}
	//음소거OnOff
	public void muteOnOff() {
		mute = !mute;
		System.out.println(mute ? "음소거가 활성화 되었습니다." : "음소거가 비활성화 되었습니다.");
	}
	
}
