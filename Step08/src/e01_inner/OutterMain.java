package e01_inner;

import e01_inner.OutterClass.InnerClass;

public class OutterMain {

	public static void main(String[] args) {
		//inner 클래스는 outter 클래스가 생성이 되야 생성이 가능
//		InnerClass inn = new InnerClass(10);
		OutterClass outter = new OutterClass(5);
		outter.printOutter();
		OutterClass outter2 = new OutterClass(100);
		
		InnerClass inn1 = outter.new InnerClass(10); 
		InnerClass inn2 = outter.new InnerClass(7);
		
		outter.setOutter(99);
		
		inn1.printInner();
		inn2.printInner();
		
		inn1.test(outter2);
	}

}




