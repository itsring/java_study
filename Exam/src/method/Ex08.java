package method;

public class Ex08 {

	public static void main(String[] args) {
		/*
		 * �Ż���� ���������ʹ� ������ �������� ������ ����ȴ�.
		 * ������ 1~10��, ������ 11~20���� �����Ѵ�.
		 * �湮 ������ �Է¹޾� Ÿ���� ���������͸� ��ȯ�ϴ� �޼ҵ� guide()�� �ϼ��Ͽ�,
		 * ��� ���� ���� ����� �����ÿ�
		 * 
		 *  ��� ��
		 *  13�� -> ���� ����������
		 *  7�� -> ���� ����������
		 *  10�� -> ���� ����������
		 */ 
		int a =13;
		int b = 7;
		int c=10;
		System.out.printf("%d�� -> %s ���������� \n", a, name(a));
		System.out.printf("%d�� -> %s ���������� \n", b, name(b));
		System.out.printf("%d�� -> %s ���������� \n", c, name(c));
	}
	public static String name(int stare) {
		if(stare >=11) {
			return "����";
		}else {
			return "����";
		}
	}
}
