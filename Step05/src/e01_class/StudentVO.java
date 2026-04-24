package e01_class;

public class StudentVO {
	// 필드
	// 학번
	private String no;
	// 이름
	private String name;
	// 학과명
	private String majorName;
	// 평점
	private double score;

	// 메서드
	// 초기화 메서드
	public void init(String s, String n, String mn, double sc) {
		no = s;
		name = n;
		majorName = mn;
		score = sc;
	}
	// 학생정보 리턴하는 메서드
	public String toStringStudent() {
		return no + " / " + name + " / " + majorName + " / " + score;
	}
}







