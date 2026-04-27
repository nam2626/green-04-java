package e02_constructor;

public class TVMain {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.powerOnOff();
		for(int i = 0;i<500;i++)
			tv.chUp();
		for(int i = 0;i<500;i++)
			tv.chDown();
		for(int i = 0;i<50;i++)
			tv.volUp();
		tv.muteOnOff();
		for(int i = 0;i<60;i++)
			tv.volDown();
		
		
	}

}
