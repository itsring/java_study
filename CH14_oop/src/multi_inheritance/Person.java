package multi_inheritance;

public class Person implements Speaker, Greeter{
	//�������̽��� ���� ���� ����, ����� �ϳ��� ����
	@Override
	public void greet() {
		// TODO Auto-generated method stub
		System.out.println("ȯ���մϴ�.");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("���� Person�Դϴ�.");
		
	}

}
