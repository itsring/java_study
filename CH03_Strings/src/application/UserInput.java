package application;

import java.util.Scanner; // ��ĳ�� ���̺귯�� ����

public class UserInput {

	public static void main(String[] args) {
		// �Է� �ޱ� scanner�̿�
		Scanner scanner = new Scanner(System.in);// ��ĳ�ʸ� ����� �� �ְ� ����
		System.out.println("�µ��� �Է��� �ּ��� :");
		double celsius = scanner.nextDouble();// ��ü�� netxtInt() �޼ҵ�� �������� �Է�
		scanner.close();
		double fahrenheit = (celsius * 9 / 5) + 32; // ȭ��
		System.out.println("���� " + celsius + "�ɴ� ȭ�� " + fahrenheit + "�� �̴�");
	}

}
