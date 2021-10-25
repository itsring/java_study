package static_innerClass;

public class Person {
	class Head {
		public void print() {//내부 클래스 Head
			System.out.println("헤드");
		}
	}
	static class Body{ // 내부 static 클래스 Body
		public void print() {
			System.out.println("바디");
		}
	}
	public void print() {//클래스 Person의 메소드
		Head head = new Head();//헤드 객체
		Body body = new Body();//바디 객체
		
		head.print();
		body.print();
	}
}
