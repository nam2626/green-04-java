package e02_object;

public class Circle implements Cloneable{
	private Point pos;
	private int r;

	public Circle(Point pos, int r) {
		this.pos = pos;
		this.r = r;
	}

	public Point getPos() {
		return pos;
	}

	public void setPos(Point pos) {
		this.pos = pos;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [pos=" + pos + ", r=" + r + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//객체 복사의 경우 깊은복사와 얕은 복사 체크
		//참조형의 경우는 반드시 깊은 복사를 수행
		//깊은 복사는 참조형의 경우 메모리 주소가 복사되니까
		//새 객체를 만들어서 저장
//		Circle temp = (Circle) super.clone();
//		temp.setPos((Point) pos.clone());
//		return temp;
		return new Circle((Point)pos.clone(), r);
	}

	
	
}





