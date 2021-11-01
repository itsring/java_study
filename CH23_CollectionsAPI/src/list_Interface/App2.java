package list_Interface;

import java.util.ArrayList;
import java.util.List;

public class App2 {

	public static void main(String[] args) {
		//리스트 인터페이스의 addAll(리스트) 추가
		List<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(6);
		list1.add(7);
		displayList(list1);
		System.out.println();
		List<Integer> list2 = new ArrayList<>();
		list2.addAll(list1);
		list1.add(4);
		list1.add(5);
		displayList(list1);
	}

	private static void displayList(List<Integer> list) {
		// 매개변수로 List 객체가 입력받아 리스트 내용을 전부 출력
		list.forEach(System.out::println);
		
	}

}
