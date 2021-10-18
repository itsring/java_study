package application;

public class BooleanAndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isRaining = true;//비가 오남?
		boolean haveUmbrella =false;//우산 가져왔나?
		boolean mightRain=true;//비가 올거같은가?

				
				
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
