package application;
import java.util.Scanner; // ��ĳ�� ���̺귯�� ���� / ��ĳ�� = ���� input
public class Ex1 {

	public static void main(String[] args) {
		// ���� �迭�� new�� 3���� ũ��� ����
		// ��ĳ�ʸ� ����� ������� 3���� ���� �Է�
		// �Է��� ���� ���ؼ� ������ ���
		int[] numbers = new int[3];
		int total=0;
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<numbers.length; i++) {
			System.out.println("���ڸ� �Է�");
			numbers[i]= scanner.nextInt();
			total +=numbers[i];
		}
		System.out.println("�Է��� ����");
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(total);
		scanner.close();
	}

}
