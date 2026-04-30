package e01_inner;

public class OutterClass {
	private int outter;

	public OutterClass(int outter) {
		this.outter = outter;
	}
	
	public void printOutter() {
		System.out.println("outter : " + outter);
	}
	
	public void setOutter(int outter) {
		this.outter = outter;
	}
	
	public class InnerClass {
		private int inner;

		public InnerClass(int inner) {
			this.inner = inner;
		}
		
		public void test(OutterClass o) {
			System.out.println(inner + " -> " + o.outter);
		}
		
		public void printInner() {
			System.out.println(outter + " -> " + inner);
		}
		
	}
}













