package method;
import java.util.Random;
public class Ex04 {

	public static void main(String[] args) {
		/*
		 *� ������ �ִ�. �� ������ �ֻ����� ���� ���´� ���� �� ��ŭ �޷��� ȹ���Ѵ�.
		 *�ֻ����� �� 3�� ���� ���� �޷�.
		 *�̸� ȯ���� ����� ����Ͻÿ�.
		 *
		 *�䱸���� : Math.random() 1�� 6������ ���ڸ� ��ȯ�ϴ� dice() �޼ҵ带 ������ ��
		 *			1�޷��� ȯ���� 1082.25108 ������ �Ѵ�.
		 *��� �� : ȹ��ݾ� : $12.00(12987��)
		 */ 
		double dollar = dice()+ dice() +dice();
		double won = exchange(dollar);
		System.out.println("$"+dollar+ "("+won+"��)");
	}
	private static int dice() {
		return (int) (Math.random()*6)+1 ;
	}
	public static double exchange(double dollar) {
		double dollarToKorea = 1082.25108*dollar;
		return Math.round(dollarToKorea);
	}
}
