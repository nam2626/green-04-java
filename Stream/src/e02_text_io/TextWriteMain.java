package e02_text_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextWriteMain {

	/*
	 * 파일 쓰기의 경우 추가모드로 파일을 연결하지 않는 이상
	 * 매번 새로운 파일이 생성
	 */
	public static void main(String[] args) {
		//1. 노드 스트림, 프로세스 스트림 생성
		//true - 추가모드, false 새파일
		try(FileWriter fw = new FileWriter("write.txt",true);
			PrintWriter pw = new PrintWriter(fw);){
			//2. 출력
			pw.println("Hello World");
			pw.println("안녕하세요.");
			pw.println(123456);
			
//			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 쓰기 완료");
	}

}









