package method;

public class Ex07 {

	public static void main(String[] args) {
		/*
		 * ���̵� ���߸� ���� ������������� ���ֵǾ���.
		 * �ش� ������� ���ð� ���� ���Ͽ� ���� �ִ��� 10.0�� ������ ���� �� �ִµ�,
		 * �� ������ ���� 70.0 �̻��϶� �հ��ϰ� �ȴ�.
		 * �־��� �ڵ��� result() �޼ҵ带 �ϼ��Ͽ�, Tom�� Kate�� �հ� ���θ� ����Ͻÿ�
		 * 
		 *  ��� ��
		 *  Tom�� ����� ��� : ���հ�
		 *  Kate�� ����� ��� : �հ�
		 */
		double tomVocal = 8.8;
		double tomDance = 7.6;
		double kateVocal = 9.2;
		double kateDance = 7.8;
		
		System.out.printf("Tom�� ����� ��� : %s\n", result(tomVocal, tomDance));
		System.out.printf("Kate�� ����� ��� : %s\n", result(kateVocal, kateDance));
	}
	public static String result(double vocal, double dance) {
		return vocal*dance >=70 ? "�հ�":"���հ�";
	}
}
