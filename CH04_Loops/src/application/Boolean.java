package application;

public class Boolean {

	public static void main(String[] args) {
		// �Ҹ� Ÿ���� ��,����(true or false)
		boolean condition1 = false; // ����� ������ �ֱ�
		System.out.println("condition1 : " + condition1);

		boolean condition2 = 4 < 5; // �������� ���� ���� �Ǻ��� ��ǻ�� �� / ��
		System.out.println("condition2 : " + condition2);

		boolean condition3 = 2 > 8; // ����
		System.out.println("condition3 : " + condition3);
		// 9�� 10�� �ٸ��� / ����
		boolean condition4 = 9 == 10; 
		System.out.println("condition4 : " + condition4);
		// �Ҹ� Ÿ���� �ƴϸ� �ȵ�
		System.out.printf("condition4 : %b", condition4); 
	}

}
