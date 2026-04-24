package vo;

public class StudentVO {
	private String no;
	private String name;
	private String majorName;
	private double score;

	public StudentVO(String no, String name, String majorName, double score) {
		this.no = no;
		this.name = name;
		this.majorName = majorName;
		this.score = score;
	}
	
	public void updateStudentVO(String no, String name, String majorName, double score) {
		this.no = no;
		this.name = name;
		this.majorName = majorName;
		this.score = score;
	}
	
	public void printInfo() {
		System.out.println(no + " " + name + " " + majorName + " " + score);
	}
	
}




