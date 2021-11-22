package ch14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.Vector;

public class ChatServer2 extends Thread{
//기능 : 멀티 쓰레드 추가
//ChatServer1.bat (바탕화면)
	
	ServerSocket server;
	//생성자 
	Vector<ClientThread2> vc;
	int port =8002;
	
	public ChatServer2() {
		try {
			//예외가 일어날 가능이 있는 코드 / 경험으로  
			server = new ServerSocket(port);
		} catch (Exception e) {
			System.err.println("Error in Server");
			e.printStackTrace();
			System.exit(1);
			//예외 확인할 코드
		}
		System.out.println("*Server 2.0**********************");
		System.out.println("클라이언트의 접속을 기다리고 있습니다.");
		System.out.println("*********************************");
		try {
			while(true) {
				Socket sock = server.accept();//client 접속 대기상태
				ClientThread2 ct = new ClientThread2(sock); 
				ct.start(); // Thread 스케쥴러에게 등록 -> 스케줄러가 시작
				vc.addElement(ct);//Vector에 추가
			}
		} catch (Exception e) {
		System.err.println("Error in Socket");
		e.printStackTrace();
		
		}
	}
	
	//접속된 모든 클라이언트에게 메세지 전송
	public void sendAllMessage(String msg) {
		for (int i 	= 0; i < vc.size(); i++) { 
			ClientThread2 ct =vc.get(i); // vc에서 가져옴
			ct.sendMessage(msg);		
		}
	}
	
	public void removeClient(ClientThread2 ct) {
		vc.remove(ct);
	}
	
	class ClientThread2 extends Thread{
		Socket sock;
		BufferedReader in;
		PrintWriter out;
		String id ="익명";
		
		public ClientThread2(Socket sock) {
			try {
				this.sock = sock;
				in = new BufferedReader(
						new InputStreamReader(
								sock.getInputStream()));
				out = new PrintWriter(
						sock.getOutputStream(), true/* auto flush */);
				System.out.println(sock + "접속됨...");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		//thread라서 override
		@Override 
		public void run() {
			try {
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
		
		//Client로 부터 요청된 문자열 분석 메소드 
		public void routine(String line) {
			
		}
		
		public void sendMessage(String msg) {
		
		}
		
	}
	
	public static void main(String[] args) {
		new ChatServer2();
	}
}
