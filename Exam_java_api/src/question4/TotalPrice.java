package question4;

import java.util.StringTokenizer;

public class TotalPrice {

	public static void main(String[] args) {
		Item item = new Item("스트라이프 셔츠", 49900);
		Item item2 = new Item("슬림 면바지", 58900);
		Item item3 = new Item("스니커즈", 46900);
		Cart myCart = new Cart();
		myCart.add(item);
		myCart.add(item2);
		myCart.add(item3);
		System.out.println(myCart.totalPrice());
	}

}
