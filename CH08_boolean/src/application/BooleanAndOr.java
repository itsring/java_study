package application;

public class BooleanAndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isRaining = true;//�� ����?
		boolean haveUmbrella =false;//��� �����Գ�?
		boolean mightRain=true;//�� �ðŰ�����?

				
				
				if((isRaining||mightRain)&& haveUmbrella) {
					System.out.println(" ����� ����.");
				}else {
					System.out.println(" ����� ���� �ʴ´�.");
				}
				boolean rainCheck = isRaining||mightRain;
				if(rainCheck&&haveUmbrella) {
					System.out.println(" ����� ����.");
				}else {
					System.out.println(" ����� ���� �ʴ´�.");
				}
	}

}
