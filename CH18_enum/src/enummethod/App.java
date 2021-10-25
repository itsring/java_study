package enummethod;

public class App {

	public static void main(String[] args) {
//		Fruit[] fruits = Fruit.values();// values �޼ҵ� : �ش� enum�� ��� ����� ������ �迭�� ����
				
		for (Fruit f : Fruit.values()) {
			System.out.println(f);

		}
		System.out.println(Fruit.APPLE.ordinal());
		System.out.println(Fruit.BANANA.ordinal());
		System.out.println(Fruit.ORANGE.ordinal());
		//valueOf("String") �޼ҵ�� ����� ������ ���� 
		Fruit f1 = Fruit.valueOf("ORANGE");
				//���ڿ� ORANGE�� ���� ���� ���� enum ����� ã�� 
		System.out.println(f1);
		System.out.println(f1==Fruit.ORANGE);
	}
	
}
