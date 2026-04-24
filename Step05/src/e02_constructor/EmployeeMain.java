package e02_constructor;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeVO emp = 
				new EmployeeVO("20202111", "김철수", true, "대리", 2300);
		emp.printInfo();
	}

}
