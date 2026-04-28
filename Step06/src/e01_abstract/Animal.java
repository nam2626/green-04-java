package e01_abstract;
/*
 *  추상 클래스(Abstract Class)
 *  	- 일반적으로 최상위 클래스로 존재(최초에 클래스의 구조를 잡는 용도)
 *  	- 추상 클래스는 직접적으로 생성되지 않음
 */

public abstract class Animal {

	public Animal() {
		System.out.println("Animal 생성자");
	}
	
	public void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
	//추상 메서드
	public abstract void run();
}



