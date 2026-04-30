package e01_inner;

import e01_inner.OutterStaticInnerClass.InnerStaticClass;

public class OutterStaticMain {

	public static void main(String[] args) {
		InnerStaticClass inStatic = new InnerStaticClass(100);
		System.out.println(inStatic.sum());
	}

}
