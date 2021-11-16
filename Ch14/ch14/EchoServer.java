package ch14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public EchoServer() { // echoserver 생성자
		// 클라이언트가 접속(로그인)하면 소켓이 만들어지게 만들 예정 / 서버 소켓
		// 각각 소켓이 작동하게 할것임 = 쓰레드 / 프로그램에서의 일의 단위 / 멀티 or 단일
		// java.io, java.net, java.sql 거의 예외가 발생함
		// 클래스명은 관례적으로 BoardMgr처럼 첫글자만 대문자
		// 변수명, 메소드명은 : 첫음글자는 소문자 그 위에 띄어쓰기되는첫문자는 대문자 getBoard(동사+타겟) setBoard

		try {
			int cnt = 0; // 클라이언트의 접속 갯수 카운트할 변수
			int port = 8000;
			ServerSocket server = new ServerSocket(port); // port number
			System.out.println("Server Socket Start.......");
			while (true) { // 서버를 만들면 무한루프 필요
				// 클라이언트가 접속할때까지 대기상태
				Socket sock = server.accept();// wait
				EchoThread et = new EchoThread(sock);
				et.start(); // run method 호출 
				cnt++;
				System.out.println("Client" + cnt + "Socket");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 클라이언트 담당은 Thread로 만들어야 한다.(내부클래스)
	// 내부클래스 : 외부클래스의 밀접한 관련이 있는 기능의 클래스(상속가능하기때문에) 다른클래스에서는 거의 사용불가.
	// 클라이언트의 대응을 각각하기 위해 Thread기능의 클래스 생성

	class EchoThread extends Thread {
		Socket sock;
		BufferedReader in; // Client가 보내는 메세지 받는 스트림
		PrintWriter out; // Client로 메세지 보내는 스트림

		public EchoThread(Socket sock) {
			try {
				this.sock = sock;
				in = new BufferedReader(
						new InputStreamReader(
								sock.getInputStream()));
				out = new PrintWriter(
						sock.getOutputStream(), true/* auto flush */);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			try {
				//Client가 접속하면 처음으로 받는 메세지
				out.println("Hello Enter BYB to exit");
				while(true) {
					//Client가 메세지 보낼때까지 대기
					String line = in.readLine();
					if(line==null) {//Client가 접속을 끊을떄
						break; // 반복문 탈출
					}
					else {
						//Client에서 온 메세지 앞에 Echo 붙혀서 반사
						out.println("Echo : "+line);
						if(line.equalsIgnoreCase("BYB")) {
							break;
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new EchoServer();
	}
}
