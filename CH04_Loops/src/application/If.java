package application;

import java.util.Scanner; // ��ĳ�� ���̺귯�� ���� / ��ĳ�� = ���� input 

public class If {

	public static void main(String[] args) {
		// ���ǹ� if
		int apples = 10;
		int bananas = 5;
		if (apples > bananas) {
			System.out.println("����� �ٳ������� ����");
		} else {
			System.out.println("����� �ٳ������� ���� ����");
		}
		System.out.println("���α׷� ����");
		
		// ����
		Scanner scanner = new Scanner(System.in);// ��ĳ�ʸ� ����� �� �ְ� ����
		System.out.print("����� ������?");
		int apple = scanner.nextInt();// ��ü�� netxtInt() �޼ҵ�� �������� �Է�
		System.out.print("�ٳ����� ������?");
		int banana = scanner.nextInt();
		scanner.close();
		if (apple > banana) {
			System.out.println("����� �ٳ������� ����");
		} 
		if(apple<banana) {
			System.out.println("�ٳ����� ������� ����");
		}
	}
}
