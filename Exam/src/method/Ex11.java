package method;

public class Ex11 {

	/*
	 * �� �Ұ��� ������ ���� ��Ҹ� �������� ȸ���� ���Ͽ� ����ȭ(0.0~5.0)�Ѵ�. ���� �ܸ� �ɷ� �Ʒ��� �ӵ�� ������ �����Ͽ�, ���
	 * ���� ���� ����� �����ÿ�. A-��� ��Ұ� 4.0�̻� B-���� 10�� �̻��̸鼭, ��� �ϳ��� 4.0�̻� C- �� ��
	 * 
	 * ��� �� X-A��� Y-B��� Z-C���
	 */

	public static void main(String[] args) {
		String x = rating(4.2, 4.7, 4.3);
		String y = rating(3.8, 4.1, 3.5);
		String z = rating(3.6, 3.0, 3.4);
		System.out.printf("X -> %s ���\n", x);
		System.out.printf("Y -> %s ���\n", y);
		System.out.printf("Z -> %s ���\n", z);
	}

	private static String rating(double personelity, double look, double ability) {
		// TODO Auto-generated method stub
		String result = "";
		if (personelity >= 4.0 && look >= 4.0 && ability >= 4.0) {
			result = "A";
		} else if (personelity + look + ability >= 10.0 &&
				(personelity >= 4.0 || look >= 4.0 || ability >= 4.0)) {
			result = "B";
		} else {
			result = "C";
		}
		return result;
	}

}
