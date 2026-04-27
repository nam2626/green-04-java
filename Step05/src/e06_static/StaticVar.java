package e06_static;
/*
 * static 키워드가 붙은 변수나 메서드는 
 * 클래스가 JVM에 로딩될 때 메모리에 올라감(클래스가 처음 사용될 때)
 */
public class StaticVar {
	
	private int n1 = 10;//StaticVar가 생성되었을때 만들어짐
	private static int n2 = 20;
	
	
	public static void main(String[] args) {
		//non-static에 접근이 불가, main 시점에서는 n1은 생성이 X
//		System.out.println(n1);
		//직접 생성 후 접근 해야함.
		StaticVar value = new StaticVar();
		System.out.println(value.n1);
		
		//static 키워드가 붙어있으면 미리 메모리가 할당되었기 때문에 접근이 가능
		System.out.println(n2);
		//static으로 선언된 변수, 상수, 메서드 접근 방법
		//클래스명.변수명, 클래스명.상수명, 클래스명.메서드()
		System.out.println(StaticVar.n2);
	}

}
