package application;

public class App {

	public static void main(String[] args) {
		//����� Ŭ���� �ҷ����� 
//		App app=new App();
//		app.main(args);
		Cat cat1=new Cat("�߿���");
		Cat cat2=new Cat("�뷩��");

		System.out.println(cat1);
		System.out.println(cat2.toString());
		//����ƽ ������ ��ü�� ������� Ŭ������.������ ���� �ҷ��´�.
		System.out.println(Cat.FOOD);
		System.out.println(Math.PI);
		System.out.println(cat1.getCount());
		Cat cat3=new Cat("�׷�");
		System.out.println(cat2.getCount());
	}

}
