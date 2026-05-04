package e02_echo_multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoMultiServerMain {

	public static void main(String[] args) {
		System.out.println("서버프로그램을 실행합니다............");

		// 1. 서버 오픈 - 포트번호 지정
		try (ServerSocket server = new ServerSocket(1234);) {
			while (true) {
				// 2. 클라이언트 접속 받음
				// 접속 정보는 Socket 클래스로 관리
				Socket client = server.accept();
				System.out.println(client.getInetAddress() + " 클라이언트 접속");
				// 3. 서버 스레드 생성
				ServerWorker worker = new ServerWorker(client);
				worker.start();
			}
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("클라이언트가 강제로 접속 종료가 되었습니다.");
		}
	}

}
