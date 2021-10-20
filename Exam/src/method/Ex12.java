package method;

public class Ex12 {

	/*
	 * ����� Java ī���� ������ �Ǿ���, ��ĥ �� �Ӥ��ٻ��鿡�� �޿��� �־���Ѵ�.
	 * �޿� ���� �� ��������� �Ʒ��� ����.
	 * �޿��� �ֱ����� �����ϸ�(�ٹ��ð� )X(�⺻�ñ�)�� �������� �Ѵ�.
	 * �ִ� �ٹ��� 40�ð��� �ʰ���, �ʰ��п� ���Ͽ� 1.5���� �޿��� �����Ѵ�.	
	 * hours>40 && hours<60
	 * basePay*40 + (hours-40)*1.5*basePay
	 * �⺻�ñ��� ���� $8.00 �̸�, �̺��� ���� ��� ����� ����Ѵ�.
	 * 	8.00<basePay
	 * �ִ� �ٹ��� 60�ð��� ���� ��, ����� ����Ѵ�.
	 * 	hours>60
	 * �� ������ �����ϴ� printPay() �޼ҵ带 �ϼ��Ͽ�, ��� ���� ���� ����� �����ÿ�.
	 * 
	 *  ��� �� :
	 *  $400.00
	 *  $550.00
	 *  ���� �ñ� ����!
	 *  �ʰ� �ٹ��ð� ����!
	 */ 
	public static void main(String[] args) {
		printPay(10.00, 40);
		printPay(10.00, 50);
		printPay(7.50, 38);
		printPay(8.50, 66);
	}

	private static void printPay(double basePay, int hours) {
		double pay=0.0;
		if(basePay<8.00) {
			System.out.println("���� �ñ� ����!");
		}else if(basePay>8.00 && hours>40 && hours<60) {
			pay=basePay*40+(hours-40)*1.5*basePay;
			System.out.printf("$ %.2f\n", pay);
		}else if(hours>=60) {
			System.out.println("�ʰ� �ٹ��ð� ����!");
		}else {
			pay=basePay*hours;
			System.out.printf("$ %.2f\n", pay);			
		}
	}

}
