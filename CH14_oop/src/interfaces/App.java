package interfaces;

public class App {

	public static void main(String[] args) {
		Describalbe[] objs = { new Person(), new Computer() };
		for (Describalbe obj : objs) {
			System.out.println(obj.getDescription());
			/*
			Object objs =new Object 로 객체를 만들었지만 인터페이스
			타입은 인터페이스 이름으로 만들어야됨
			*/
			
		}
	}

}
