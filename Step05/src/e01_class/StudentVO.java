package e01_class;

public class StudentVO {
	// 학번
	String no;
	// 이름
	String name;
	// 학과명
	String majorName;
	// 평점
	double score;

	// 초기화 메서드
	void init(String s, String n, String mn, double sc) {
		no = s;
		name = n;
		majorName = mn;
		score = sc;
	}
	// 학생정보 리턴하는 메서드
	String toStringStudent() {
		return no + " / " + name + " / " + majorName + " / " + score;
	}
}







