package method;

public class Ex05 {

	public static void main(String[] args) {
		/*
		 * ü�°� �����̵��ÿ� 2000�̻��̿��߸� ������ ������ �������� �ִ�.
		 * ü�°� ������ �Է��Ͽ� ���� ����� ����ϴ� �޼ҵ� wear()�� �������ϰ�
		 * ��� ���� ���� ����� �����ÿ�.
		 * ��
		 * �����������Ϸ�!
		 * �������� ������ �� �����ϴ�. 
		 */
		wear(2400,3000);
		wear(3800,1200);
	}
	public static void wear(int hp, int mp) {
		if(hp>=2000 && mp >= 2000) {
			System.out.println("������ ���� �Ϸ�!");
		}else {
			System.out.println("�������� ������ �� �����ϴ�.");			
		}
	}
}
