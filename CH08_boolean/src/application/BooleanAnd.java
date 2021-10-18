package application;

public class BooleanAnd {

	public static void main(String[] args) {
		// == 같다, != 같지않다, ! not , && and , || or 
		boolean isRaining = true;//비가 오남?
		boolean haveUmbrella =false;//우산 가져왔나?
		boolean takeUmbrella=false;//우산 쓰나?

		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella = true;
				
			}
		}
		System.out.println("첫번째 : " + takeUmbrella);
		if(isRaining&&haveUmbrella) {
			takeUmbrella=true;
		}
		System.out.println("두번째 : " + takeUmbrella);
		
		//삼항조건 연산자
		takeUmbrella=isRaining&&haveUmbrella ? true:false;
		System.out.println("세번째 : " + takeUmbrella);
		
		
	}

}
