package application;

public class Printf {

	public static void main(String[] args) {
		// ��¼��� %d, %f, %c, %s 
		int age= 25;
		String addr = "�λ�";
		System.out.printf("�� ���̴� %d�� �Դϴ�.\n",age);
		System.out.printf("�� ���̴� %d ���̰� %s�� ��� �ֽ��ϴ�.", age, addr);
		double pi=3.141592;
		System.out.printf("������ ���� : %.2f", pi);
		
	}

}
