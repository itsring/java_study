package application;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);// ��ĳ�ʸ� ����� �� �ְ� ����
		System.out.print("����� ������?");
		int apple = scanner.nextInt();// ��ü�� netxtInt() �޼ҵ�� �������� �Է�
		System.out.print("�ٳ����� ������?");
		int banana = scanner.nextInt();
		scanner.close();
		if (apple > banana) {
			System.out.println("����� �ٳ������� ����");
		} else {
			System.out.println("�ٳ����� ������� ���ų� ����");
		}
	}

}
