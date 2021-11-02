package question5;

import java.util.ArrayList;

public class TotalSales {

	public static void main(String[] args) {
		ArrayList<Menu> menu = new ArrayList<>();
		Store store = new Store();
		int total =0;
		store.add(new Menu("김밥",2000,57));
		store.add(new Menu("돈까스",6000,29));
		store.add(new Menu("냉면",5000,34));
		
		System.out.println("하루 총 매출 : " + store.totalSales());
	}

}

class Store {
	private ArrayList<Menu> list;
	public Store() {
		this.list = new ArrayList<Menu>();
		
	}
	public void add(Menu menu) {
		list.add(menu);
	}
	public int totalSales() {
		int total = 0;
		for(Menu price : list) {
			total = total + price.getPrice()*price.getCount();
		}
		return total;
	}
}
class Menu{
	private String name;
	private int price;
	private int count;
	
	public Menu(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}