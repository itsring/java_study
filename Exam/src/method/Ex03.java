package method;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 * ���ָ� 8.86L�� ������ A�ڵ����� �� 182.736Km�� ������ �� �ִٰ� �Ѵ�.
		 * �� ���� ���� ����ϴ� �޼ҵ带 �ϼ��ϰ�, 
		 * ��� ���� ���� ����� �����ÿ�
		 * ��� �� : ���� : 20.62km/L 
		 */
		double gasolin = 8.86;
		double carCanGoDistancs = 182.736;
		double result = calculateOilCell(gasolin, carCanGoDistancs);
		System.out.println("���� : "+ result+ "km/L");
		
	}
	private static double calculateOilCell(double fuel, double distance) {
		return Math.round(distance/fuel*100)/100.0;
	}

}
