package ch14;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;

public class ChatClientAWT3 extends MFrame implements ActionListener, Runnable {

	Button saveBtn, msgBtn, sendBtn;
	TextField sendTf;
	TextArea contentArea;
	List chatList;
	Socket sock;
	BufferedReader in;
	PrintWriter out;
	String title = "ChatClient 3.0";
	String listTitle = "*****CHAT LIST*****";
	boolean flag = false;
	String id;
	String label[]= {"SAVE","MESSAGE","SEND"};
	/*
	 * main 메소드 삭제 AWT2에 있던 파일 복사 후 ip, port, connect(버튼) 모두 삭제 connect 메소드 삭제 AWT2에
	 * 있던 메소드와 ip, port connect 등 접속 관련 -> LoginAWT3에 분산시킴 생성자에 쓰레드 시작 코드 추가
	 * actionPerformed에서 connection 버튼 이벤트 삭제 / id입력 부분 삭제 
	 */
	public ChatClientAWT3(BufferedReader in, PrintWriter out, String id) {
		super(450, 500);
		this.in = in;
		this.out = out;
		this.id = id;
		setTitle(title + " - " + id + "님 반갑습니다.");
		contentArea = new TextArea(title);
		contentArea.setBackground(Color.DARK_GRAY);
		contentArea.setForeground(Color.GREEN);
		contentArea.setEditable(false);
		add(BorderLayout.CENTER, contentArea);
		// /////////////////////////////////////////////////////////////////////////////////////////
		Panel p2 = new Panel();
		p2.setLayout(new BorderLayout());
		chatList = new List();
		chatList.add(listTitle);
		p2.add(BorderLayout.CENTER, chatList);
		Panel p3 = new Panel();
		p3.setLayout(new GridLayout(1, 2));
		saveBtn = new Button(label[0]);
		saveBtn.addActionListener(this);
		msgBtn = new Button(label[1]);
		msgBtn.addActionListener(this);
		p3.add(saveBtn);
		p3.add(msgBtn);
		p2.add(BorderLayout.SOUTH, p3);
		add(BorderLayout.EAST, p2);
		// ///////////////////////////////////////////////////////////////////////////////////////////
		Panel p4 = new Panel();
		sendTf = new TextField("", 50);
		sendTf.addActionListener(this);
		sendBtn = new Button(label[2]);
		sendBtn.addActionListener(this);
		p4.add(sendTf);
		p4.add(sendBtn);
		add(BorderLayout.SOUTH, p4);
		new Thread(this).start();
		validate();
	}

	public void run() {
		try {
			while (true) {
				String line = in.readLine();
				if (line == null) {
					break;
				} else {
					routine(line);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// run

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == saveBtn)/* save */ {
			// 대화내용 저장, 대화내용을 저장했습니다. 출력
			String content = contentArea.getText();
			// 유니크한 파일 이름 제작 1970년1월1일~현재가지 1/1000초 단위로 ㅖ산
			long fileName = System.currentTimeMillis();
			try {
				FileWriter fw = new FileWriter("ch14/" + fileName + ".txt");
				fw.write(content);
				fw.close();
				contentArea.setText("");
				new MDialog(this, "Save", "대화내용을 저장하였습니다.");

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} else if (obj == msgBtn)/* message */ {
			int i = chatList.getSelectedIndex();
			if (i == -1 || i == 0)/* 전체 채팅 */ {
				new MDialog(this, "경고", "아이디를 선택하세요");
			} else {

				new Message("TO:");
			}
		} else if (obj == sendBtn)/* send */ {
			String str = sendTf.getText();
			if (filterMgr(str)) {
				new MDialog(this, "경고", "입력하신 글자는 금지어 입니다.");
				return;// 메소드를 중간에 빠져나가는 결과. 즉 밑에 소스는 의미가 없어짐
				// 메소드 중간에 return은 메소드를 빠져나가는 역할
			}
			int i = chatList.getSelectedIndex();
			if (i == -1 || i == 0)/* 전체 채팅 */ {
				sendMessage(ChatProtocol2.CHATALL + ":" + str);
			} else /* 귓속말 채팅 */ {
				String id = chatList.getSelectedItem();// 선택한 id를 리턴
				sendMessage(ChatProtocol2.CHAT + ":" + id + ";" + str);
			}
			sendTf.setText("");
			sendTf.requestFocus();
		}
	}// ----------actionPerformed

	public void routine(String line) {

		int idx = line.indexOf(':');
		String cmd/* CHATALL */ = line.substring(0, idx);
		String data/* 오늘은... */ = line.substring(idx + 1);
		if (cmd.equals(ChatProtocol2.CHATLIST)) {
			// 이용자 명단 1개씩 add
			// data : aaa;bbb;ccc;
			chatList.removeAll();// 기존에 추가된 item을 모두 삭제
			chatList.add(listTitle); // 처음부분 "*******대화자명단*******"
			StringTokenizer st = new StringTokenizer(data, ";");
			while (st.hasMoreTokens()) {
				chatList.add(st.nextToken()); // 이용자 순차적으로 하나씩 추가
			}
		} else if (cmd.equals(ChatProtocol2.CHAT) || cmd.equals(ChatProtocol2.CHATALL)) {
			// CHATALL:[aaa]채팅메세지 & CHAT:[aaa(S)]채팅메세지
			contentArea.append(data + "\n");
		} else if (cmd.equals(ChatProtocol2.MESSAGE)) {
			// data -> bbb;밥묵자
			idx = data.indexOf(';');
			cmd/* bbb */ = data.substring(0, idx);
			data/* 밥묵자 */ = data.substring(idx);
			new Message("FROM", cmd, data);
		}
	}// routine

	public void sendMessage(String msg) {
		out.println(msg);
	}

	public boolean filterMgr(String msg) {
		boolean flag = false;
		// false = 금지어 아님
		String str[] = { "멍청이", "자바", "개새끼", "JAVA" };
//		msg=하하 호호 히히
		StringTokenizer st = new StringTokenizer(msg);
		/* StringTokenizer : 구분자를 기준으로 단어 자르기 / 기본값 : 공백 */
		String msgs[] = new String[st.countTokens()];
		for (int i = 0; i < msgs.length; i++) {
			msgs[i] = st.nextToken();

		}
		// 배열과 배열을 비교할때는 이중 반복
		for (int i = 0; i < str.length; i++) {
			if (flag)
				break; // 첫번째 for문 빠져나감
			for (int j = 0; j < msgs.length; j++) {
				if (str[i].equalsIgnoreCase(msgs[j])) {
					flag = true;
					break;// 두번째 for문 빠져나감
				}
			}
		}
		return flag;
	}

	class Message extends Frame implements ActionListener {

		Button send, close;
		TextField name;
		TextArea ta;
		String mode;// to/from
		String id;

		public Message(String mode) {
			setTitle("쪽지보내기");
			this.mode = mode;
			id = chatList.getSelectedItem();
			layset("");
			validate();
		}

		public Message(String mode, String id, String msg) {
			setTitle("쪽지읽기");
			this.mode = mode;
			this.id = id;
			layset(msg);
			validate();
		}

		public void layset(String msg) {
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					dispose();
				}
			});
			Panel p1 = new Panel();
			p1.add(new Label(mode, Label.CENTER));
			name = new TextField(id, 20);
			p1.add(name);
			add(BorderLayout.NORTH, p1);

			ta = new TextArea("");
			add(BorderLayout.CENTER, ta);
			ta.setText(msg);
			Panel p2 = new Panel();
			if (mode.equals("TO:")) {
				p2.add(send = new Button("send"));
				send.addActionListener(this);
			}
			p2.add(close = new Button("close"));
			close.addActionListener(this);
			add(BorderLayout.SOUTH, p2);

			setBounds(200, 200, 250, 250);
			setVisible(true);
		}

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == send) {
				sendMessage(ChatProtocol2.MESSAGE + ":" + id + ";" + ta.getText());
			}
			setVisible(false);
			dispose();
		}
	}

	class MDialog extends Dialog implements ActionListener {

		Button ok;
		ChatClientAWT3 ct2;

		public MDialog(ChatClientAWT3 ct2, String title, String msg) {
			super(ct2, title, true);
			this.ct2 = ct2;
			//////////////////////////////////////////////////////////////////////////////////////////
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					dispose();
				}
			});
			/////////////////////////////////////////////////////////////////////////////////////////
			setLayout(new GridLayout(2, 1));
			Label label = new Label(msg, Label.CENTER);
			add(label);
			add(ok = new Button("확인"));
			ok.addActionListener(this);
			layset();
			setVisible(true);
			validate();
		}

		public void layset() {
			int x = ct2.getX();
			int y = ct2.getY();
			int w = ct2.getWidth();
			int h = ct2.getHeight();
			int w1 = 150;
			int h1 = 100;
			setBounds(x + w / 2 - w1 / 2, y + h / 2 - h1 / 2, 200, 100);
		}

		public void actionPerformed(ActionEvent e) {
			sendTf.setText("");
			dispose();
		}
	}
}