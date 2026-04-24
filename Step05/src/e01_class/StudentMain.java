package e01_class;

public class StudentMain {

	public static void main(String[] args) {
		//Student 객체 3개 생성하고 데이터 셋팅 후에 출력
		StudentVO vo1 = new StudentVO();
		StudentVO vo2 = new StudentVO();
		StudentVO vo3 = new StudentVO();
		
		vo1.init("20050202", "홍길동", "컴퓨터공학과", 3.2);
		vo2.init("20202444", "김철수", "경영지원학과", 3.5);
		vo3.init("20115544", "안영희", "생활체육학과", 4.2);
		
		System.out.println(vo1.toStringStudent());
		System.out.println(vo2.toStringStudent());
		System.out.println(vo3.toStringStudent());

	}

}
