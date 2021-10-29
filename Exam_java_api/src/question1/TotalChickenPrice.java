package question1;
import java.util.ArrayList;
public class TotalChickenPrice {

	public static void main(String[] args) {
		// 
		ArrayList<Chicken> order = new ArrayList<Chicken>();
		
		order.add(new Chicken("로스트 치킨",9900));
		order.add(new Chicken("파닭",12900));
		order.add(new Chicken("마늘아 치킨",13900));
//		System.out.println(order);
		int sum =0;
		for(Chicken price : order) {
			sum+=price.getPrice();
		}
		System.out.println("총합 : "+sum+"원 " );
	}

}
