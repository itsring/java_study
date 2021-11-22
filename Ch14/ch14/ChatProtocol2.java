package ch14;

public class ChatProtocol2 {
	
	public static final String ID = "ID";
//	C -> S ID:aaa
//	S -> C chatlist : aaa; bbb; ccc; ddd;
	
	public static final String CHAT = "CHAT";
//	C -> S chat :받는아이디;채팅내용(aptpwl) ex)CHAT : bbb;
// 	S -> C CHAT : 보내는아이디;채팅메세지 chat:aaa밥뭊ㄱ묵자
	
	public static final String CHATALL = "CHATALL";
//	C -> S CHATTALL : 채팅메세지
//	S -> C CHATTAL : [보내는아이디] 채팅메세지
	
	public static final String MESSAGE = "MESSAGE";
//	C -> S MESSAGE:받는아이디; 쪽지
//	S -> C MESSAGE : 보내는 아이디,쪽지
	
	public static final String CHATLIST = "CHATLIST";
//	C -> S CHATLIST : aaa;bbb;ccc;ddd;
	public ChatProtocol2() {
		// TODO Auto-generated constructor stub
	}
	
}
