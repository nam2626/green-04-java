package e01_inner;

import e01_inner.OutterClass.InnerClass;

/**
 * 내부 클래스를 테스트하는 메인 클래스
 */
public class OutterMain {

	public static void main(String[] args) {
		// 1. 내부 클래스는 외부 클래스(OutterClass)의 인스턴스가 먼저 생성되어야 생성 가능합니다.
		// InnerClass inn = new InnerClass(10); // 에러 발생: 외부 클래스 객체 없이는 생성 불가
		
		OutterClass outter = new OutterClass(5);
		outter.printOutter();
		
		OutterClass outter2 = new OutterClass(100);
		
		// 2. 내부 클래스 객체 생성 방법: 외부클래스참조변수.new 내부클래스()
		InnerClass inn1 = outter.new InnerClass(10); 
		InnerClass inn2 = outter.new InnerClass(7);
		
		// 외부 클래스의 변수 값을 변경하면 내부 클래스에서도 변경된 값을 참조하게 됩니다.
		outter.setOutter(99);
		
		// 내부 클래스의 메서드 호출: 외부 클래스의 멤버에 접근하는 것을 확인
		inn1.printInner();
		inn2.printInner();
		
		// 내부 클래스에서 다른 외부 클래스 인스턴스(outter2)에 접근하는 테스트
		inn1.test(outter2);
	}

}
