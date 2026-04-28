package e02_object;

public class CloneMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		Point p1 = new Point(10, 7);
		//p1을 복제해서 p2에 저장
		Point p2 = (Point) p1.clone();
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
