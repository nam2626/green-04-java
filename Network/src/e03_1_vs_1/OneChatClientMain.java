package e03_1_vs_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class OneChatClientMain {
	public static class Worker extends Thread{
		private Socket client;

		public Worker(Socket client) {
			this.client = client;
		}
		
		@Override
		public void run() {
			try(BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()))){
				while(true) {
					String str = br.readLine();
					if(str == null || str.equals("exit")) break;
					System.out.println(str);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
		
	}
	public static void main(String[] args) {
		try(Socket server = new Socket("127.0.0.1",5555);
			Scanner sc = new Scanner(System.in);
			PrintWriter pw = new PrintWriter(
					server.getOutputStream())){
			Worker worker = new Worker(server);
			worker.start();
			while(true) {
				System.out.println("메세지 입력 : ");
				String msg = sc.nextLine();
				if(msg.equals("exit")) break;
				pw.println(msg);
				pw.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}


