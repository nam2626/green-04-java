package e01_inner;

public class OutterClass {
	private int outter;

	public OutterClass(int outter) {
		this.outter = outter;
	}
	
	public void printOutter() {
		System.out.println("outter : " + outter);
	}
	
	public class InnerClass {
		private int inner;

		public InnerClass(int inner) {
			this.inner = inner;
		}
		
		public void printInner() {
			System.out.println(outter + " -> " + inner);
		}
		
	}
}













