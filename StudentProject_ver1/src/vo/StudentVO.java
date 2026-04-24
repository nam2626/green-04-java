package vo;

/**
 * 학생 정보를 저장하는 Value Object 클래스
 */
public class StudentVO {
	// 필드(데이터)
	private String no;          // 학번
	private String name;        // 이름
	private String majorName;   // 학과명
	private double score;       // 평점

	/**
	 * 모든 필드를 초기화하는 생성자
	 */
	public StudentVO(String no, String name, String majorName, double score) {
		this.no = no;
		this.name = name;
		this.majorName = majorName;
		this.score = score;
	}
	
	/**
	 * 학생 정보를 일괄 수정하는 메서드
	 */
	public void updateStudentVO(String no, String name, String majorName, double score) {
		this.no = no;
		this.name = name;
		this.majorName = majorName;
		this.score = score;
	}
	
	/**
	 * 학생의 상세 정보를 콘솔에 출력하는 메서드
	 */
	public void printInfo() {
		System.out.println(no + " " + name + " " + majorName + " " + score);
	}
	
	/**
	 * 학번을 반환하는 Getter 메서드
	 */
	public String getNo() {
		return no;
	}
	
}




