/*2021.11.22*/
package ch14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
public class ChatServer3 extends Thread{
//기능 : 멀티 쓰레드 추가
//ChatServer1.bat (바탕화면)
	
	ServerSocket server;
	Vector<ClientThread3> vc;
	int port =8003;
	ChatMgr3 mgr;
	
	public ChatServer3() {
		try { 
			server = new ServerSocket(port);
			vc=new Vector<ClientThread3>();
			mgr = new ChatMgr3();
		} catch (Exception e) {
			System.err.println("Error in Server");
			e.printStackTrace();
			System.exit(1);
			//예외 확인할 코드
		}
		System.out.println("*********************************");
		System.out.println("********** Server 3.0 ***********");
		System.out.println("   클라이언트의 접속을 기다리고 있습니다.   ");
		System.out.println("*********************************");
		try {
			while(true) {
				Socket sock = server.accept();//client 접속 대기상태
				ClientThread3 ct = new ClientThread3(sock); 
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
			ClientThread3 ct =vc.get(i); // vc에서 가져옴
			ct.sendMessage(msg);		
		}
	}
	
	public void removeClient(ClientThread3 ct) {
		vc.remove(ct);
	}
	
	class ClientThread3 extends Thread{
		Socket sock;
		BufferedReader in;
		PrintWriter out;
		String id ="익명";
		
		public ClientThread3(Socket sock) {
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
				//Client에게 최초 보내는 메세지
//				out.println("사용하실 아이디를 입력하세요.");
				while(true) {
					String line = in.readLine();
					if(line==null) {
						break;
					}else {
						routine(line);
					}
				}
			} catch (Exception e) {
//				Client 연결이 끊어질 때 
				//Vector에서 자기의 객체를 제거 
				removeClient(this);
				System.err.println(sock+"["+id+"] 끊어짐");
//				e.printStackTrace();
			}
		} 
		
		//Client로 부터 요청된 문자열 분석 메소드 
		public void routine(String line) {
//			System.out.println("line : "+ line);
			//CHATALL : 오늘은 월요일입니다.
			int idx=line.indexOf(':');
			String cmd/*CHATALL*/ = line.substring(0,idx);
			String data/*오늘은...*/ = line.substring(idx+1);
			if(cmd.equals(ChatProtocol3.ID)) {
				//data=aaa
				idx=data.indexOf(';');
				cmd=data.substring(0,idx);//aaa
				data=data.substring(idx+1);//1234
				if(mgr.loginChk(cmd, data)) {
					id=cmd;
					//새로운 접속자가 추가되었기 때문에 리스트 재전송
					
					sendAllMessage(ChatProtocol3.ID+":"+"T");//성공시 T
					sendAllMessage(ChatProtocol3.CHATLIST+":"+getIds());
					sendAllMessage(ChatProtocol3.CHATALL+
							":"+"["+id+"]님이 입장하였습니다.");
					//모든 접속자에게 입장메세지 전송
				}else {
					//로그인이 정상적으로 안된 경우 F
					sendMessage(ChatProtocol3.ID+":"+"F");
				}
			}else if(cmd.equals(ChatProtocol3.CHAT)) {
				//data CHAT: bbb;밥묵자
				idx=data.indexOf(';');
				cmd/*bbb*/=data.substring(0,idx);
				data/*밥묵자*/=data.substring(idx+1);
				// ct == bbb Client 객체
				ClientThread3 ct = findClient(cmd);
				if(ct!=null) {
					ct.sendMessage(ChatProtocol3.CHAT+":["+id+"(S)]"+data);
				}else { // 내 자신에게 보냄
					sendMessage(ChatProtocol3.CHAT+":["+cmd+"] 접속자가 아닙니다.");
				}
			}else if(cmd.equals(ChatProtocol3.MESSAGE)) {
				idx=data.indexOf(';');
				cmd/**/=data.substring(0,idx);
				data/*자*/=data.substring(idx);
				
				ClientThread3 ct = findClient(cmd);
				if(ct!=null) {
					ct.sendMessage(ChatProtocol3.MESSAGE+": "+id+";"+data);
				}else { // 내 자신에게 보냄
					sendMessage(ChatProtocol3.CHAT+": ["+cmd+"] 접속자가 아닙니다.");
				}
			}else if(cmd.equals(ChatProtocol3.CHATALL)) {
				sendAllMessage(ChatProtocol3.CHATALL+": ["+id+"]"+data);
			}
		}
		
		//매개변수로 받은 id값으로 CLientThread2를 검색한다.
		public ClientThread3 findClient(String id) {
			ClientThread3 ct = null;
			for (int i = 0; i < vc.size(); i++) {
				ct=vc.get(i);
				if(id.equals(ct.id)) {
					break;
				}
			}
			return ct;
		}
		//접속된 모든 id 리턴
		public String getIds() {
			String ids="";
			for (int i = 0; i < vc.size(); i++) {
				ClientThread3 ct=vc.get(i);
				ids+=ct.id+";"; // 107라인에서 id값 넣어줌
			}
			return ids; //aaa;,bbb;,홍길동;ㅊㅊㅊ;ㅁ123; 만들어주는 메소드
		}
		//접속된 id 
		public void sendMessage(String msg) {
			out.println(msg);
		}
		
	}
	
	public static void main(String[] args) {
		new ChatServer3();
	}
}
