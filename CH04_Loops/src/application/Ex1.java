package application;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);// ��ĳ�ʸ� ����� �� �ְ� ����
		System.out.println("�޴�");
		System.out.println("====");
		System.out.println("1. ����Ʈ '��ο�'");
		System.out.println("2. ����Ʈ '�ȳ�?'");
		System.out.println("3. ���α׷� ����\n");
		System.out.print("�ɼ��� ���� >");
		int option = scanner.nextInt();
		scanner.close();
		if (option == 1) {
			System.out.println("��ο�");
		} 
		else if(option == 2) {
			System.out.println("�ȳ�?");
		}else if(option == 3) {
			System.out.println("�����մϴ�.");
		}
		else if(option == 10000){
			System.out.println("�̽��Ϳ��� �߰�!");
		}else{
			System.out.println("�߸��� �ɼ��� �����Ͽ����ϴ�.");
		}
	}

}
