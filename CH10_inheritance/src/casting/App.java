package casting;


public class App {

	public static void main(String[] args) {
		//����Ÿ�� : �⺻�� ������Ŭ���� Ÿ�� ��
				Cat cat1 = new HouseCat(); // ������� ��ü
				cat1.vocal();
				cat1.hunt();
				//Cat Ÿ���̱� ������ cat1.call();�� ��� �ȵ�
				//Cat�޼ҵ常 ��� ���� / Overriding ��
				
				
				//�ٿ� ĳ����  (Ÿ���� �ٽ� ���� Ŭ������ ��ȯ)
				HouseCat cat2 = (HouseCat)cat1;
				cat2.call(); // ������ ����� ������� ��ü�� call�޼ҵ� ����
	}

}
