package interfaces;

public class App {

	public static void main(String[] args) {
		Describalbe[] objs = { new Person(), new Computer() };
		for (Describalbe obj : objs) {
			System.out.println(obj.getDescription());
			/*
			Object objs =new Object �� ��ü�� ��������� �������̽�
			Ÿ���� �������̽� �̸����� �����ߵ�
			*/
			
		}
	}

}
