package application;

public class BooleanOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isRaining = true;//�� ����?
		boolean haveUmbrella =false;//��� �����Գ�?
		boolean takeUmbrella=false;//��� ����?
		boolean mightRain=true;
		//OR
				takeUmbrella = isRaining||mightRain;
				System.out.println("�׹�° : " + takeUmbrella);
				
				
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
