package e02_constructor;

import java.util.Arrays;

public class EmployeeMain {

	public static void main(String[] args) {
//		EmployeeVO emp = 
//				new EmployeeVO("20202111", "김철수", true, "대리", 2300);
//		emp.printInfo();
//		EmployeeVO vo = new EmployeeVO();
		EmployeeVO[] arr = new EmployeeVO[10];
		System.out.println(Arrays.toString(arr));
		int i = 0;
		arr[i++] = new EmployeeVO("20005555", "김철수", true, "대리", 3200);
		arr[i++] = new EmployeeVO("20002314", "박철우", false, "사원", 2800);
		arr[i++] = new EmployeeVO("20007655", "이우소", true, "대리", 3200);
		arr[i++] = new EmployeeVO("20003333", "전재석", true, "과장", 4200);
		arr[i++] = new EmployeeVO("20003254", "약지연", false, "차장", 7200);
		
		//배열에 있는 전체 사원정보 출력
		for (int j = 0; j < i; j++) {
			arr[j].printInfo();
		}
		
	}

}







