package ch14;

import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public EchoServer() { // echoserver 생성자
		//클라이언트가 접속(로그인)하면 소켓이 만들어지게 만들 예정 / 서버 소켓
		// 각각 소켓이 작동하게 할것임 = 쓰레드 / 프로그램에서의 일의 단위 / 멀티 or 단일
		try {
			int cnt =0; // 클라이언트의 접속 갯수 카운트할 변수 
			ServerSocket server = new ServerSocket(8000); // port number
			System.out.println("Server Socket Start.......");
			while(true) {
				Socket sock = server.accept();//wait
				
				cnt++;
				System.out.println("Client"+cnt+"Socket");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//클라이언트 담당은 Thread로 만들어야 한다.(내부클래스)
	
	class EchoThread extends Thread{
		@Override
		public void run() {
			
		}
	}
	
	public static void main(String[] args) {
		new EchoServer();
	}
}
