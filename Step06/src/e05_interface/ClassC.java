package e05_interface;

public class ClassC implements InterA, InterB{

	@Override
	public void interB() {
		System.out.println("ClassC interB");
	}

	@Override
	public void interA() {
		System.out.println("ClassC interA");
	}

}
