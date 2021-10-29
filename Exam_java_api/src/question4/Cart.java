package question4;

import java.util.ArrayList;

public class Cart {
	private ArrayList<Item> list;
	public Cart() {
		this.list = new ArrayList<Item>();
	}
	public void add(Item item){
		list.add(item);
	}
	
	public int totalPrice() {
		int sum =0;
		for(Item price : list) {
			sum+=price.getPrice();
		}
		return sum;
	}
}

class Item{
	private String name;
	private int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price=price;
	}

	public int getPrice() {
		return price;
	}
	
}