package list_Interface;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		//어레이리스트와 링크드 리스트는 둘다 리스트인터페이스를 구현함
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		displayList(numbers);
	}

	private static void displayList(List<Integer> list) {
		// 매개변수로 List 객체가 입력받아 리스트 내용을 전부 출력
		list.forEach(System.out::println);
		
	}

}
