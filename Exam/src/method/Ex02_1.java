package method;

public class Ex02_1 {

	public static void main(String[] args) {
		// 1.Į�θ� ����� ���� �޼ҵ带 ȣ���Ͻÿ�
		double result = calculateCalory(5000);
				/* 3. ����� ����Ͻÿ�*/
		System.out.println(result+" kcal");
	}
	/*2. Į�θ� ��� �޼ҵ带 �����Ͻÿ�*/
	private static double calculateCalory(int walk) {
		return 0.02*walk;
	}
}
