package hello;

import java.util.ArrayList;

public class Main7 {

	public static void main(String[] args) {
		// 제네릭
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello"); // list의 index[0] 의 value
		list.add("Hello");//  list의 index[1] 의 value
		System.out.println(list);
		
	}

}
