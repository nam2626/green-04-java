package e01_file;

import java.io.File;
import java.io.IOException;

public class FileTest {
	/*
	 * 	File 클래스 - File
	 * 		자바로 파일을 생성, 삭제, 경로 생성(폴더)
	 * 		파일 이름 변경, 해당 경로 파일 목록 조회
	 * 		파일 크기
	 * 
	 */
	public static void main(String[] args) {
		//파일클래스 생성자에는 파일 전체 경로 지정
		File file = new File("c:\\test"+File.separator+"hello.txt");
		System.out.println(file);
		//현재 파일의 절대 경로를 뽑음(실제 파일 위치 전체 경로)
		System.out.println(file.getAbsolutePath());
		//현재 파일의 저장된 폴더까지의 경로를 뽑음 - 문자열
		System.out.println(file.getParent());
		//현재 파일의 저장된 폴더까지의 경로를 뽑음 - 파일 객체
		File parent = file.getParentFile();
		System.out.println(parent);
		try {
			if(!parent.exists()) {
				parent.mkdirs();//해당 경로까지의 모든 폴더를 생성
				System.out.println("폴더 생성 완료");
			}
			//파일 생성
			boolean result = file.createNewFile(); //이미 있으면 생성 X
			System.out.println(result ? "파일 생성 성공" : "실패");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		//너 폴더냐?
		System.out.println(file.isDirectory());
		System.out.println(parent.isDirectory());
		//너 파일이냐?
		System.out.println(file.isFile());
		System.out.println(parent.isFile());
		//파일 용량 체크 - byte
		System.out.println(file.length());
		//현재 파일이 위치한 파티션의 총 용량 크기
		System.out.println(file.getTotalSpace());
		//현재 파일이 위치한 파티션의 사용가능한 용량 크기
		System.out.println(file.getUsableSpace());
		//파일명
		System.out.println(file.getName());
		//파일명 바꾸기
//		file.renameTo(new File("test.txt"));
		//파일 삭제
		System.out.println(file.delete());
		new File("test.txt").delete();
		//해당 폴더에 있는 파일 및 폴더들을 조회
		
		String[] arr = parent.getParentFile().list();
		for(String str : arr) {
			System.out.println(str);
		}
	}

}








