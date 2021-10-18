package application;

public class BooleanOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isRaining = true;//비가 오남?
		boolean haveUmbrella =false;//우산 가져왔나?
		boolean takeUmbrella=false;//우산 쓰나?
		boolean mightRain=true;
		//OR
				takeUmbrella = isRaining||mightRain;
				System.out.println("네번째 : " + takeUmbrella);
				
				
				if((isRaining||mightRain)&& haveUmbrella) {
					System.out.println(" 우산을 쓴다.");
				}else {
					System.out.println(" 우산을 쓰지 않는다.");
				}
				boolean rainCheck = isRaining||mightRain;
				if(rainCheck&&haveUmbrella) {
					System.out.println(" 우산을 쓴다.");
				}else {
					System.out.println(" 우산을 쓰지 않는다.");
				}
	}

}
