package static_innerClass;

public class Person {
	class Head {
		public void print() {//���� Ŭ���� Head
			System.out.println("���");
		}
	}
	static class Body{ // ���� static Ŭ���� Body
		public void print() {
			System.out.println("�ٵ�");
		}
	}
	public void print() {//Ŭ���� Person�� �޼ҵ�
		Head head = new Head();//��� ��ü
		Body body = new Body();//�ٵ� ��ü
		
		head.print();
		body.print();
	}
}
