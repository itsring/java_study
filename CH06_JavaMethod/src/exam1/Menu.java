package exam1;

public class Menu {
	String[] option = { "������ ����", "������ �߰�", "������ ����", "����" };

	void display() {
		System.out.println("�޴��� ���� : ");
		for (int i = 0; i < option.length; i++) {
			System.out.printf("%d. %s\n", i, option[i]);
		}
	}
}
