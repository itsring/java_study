package method;

public class Ex02_2 {

	public static void main(String[] args) {
		/*
		 * ���� 1�κ��� ���Դ� 180g �̰�, �� ���� 1g�� Į�θ��� 5.179kcal �̴�.
		 *  �̸� �����Ͽ� ���� 3�κ��� Į�θ��� �Ҽ��� ���� ��°�ڸ����� ����Ͻÿ� 
		 */ 
		double result = calculateCalory(3);
		System.out.println(result + " kcal");
		
	}
	private static double calculateCalory(int walk) {
		return Math.round(180*walk*5.179*1000)/1000.0;
	}
}
