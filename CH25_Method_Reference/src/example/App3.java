package example;

import java.util.ArrayList;
import java.util.List;

public class App3 {
	// 객체없이 바로 사용하기 위해 static

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(6);
		numbers.add(4);
		numbers.add(7);
		numbers.add(3);
		numbers.add(6);
		numbers.add(3);
		
		numbers.removeIf(App3::fillter);
		numbers.replaceAll(App3::doubleValue);
		
		numbers.forEach(System.out::println);
		
	}
	// 메소드 레퍼런스 1.static 2. 리턴값 3. 매개변수를 맞춘다
	private static Boolean fillter(Integer n) {
		
		return n<5;
	}
	private static Integer doubleValue(Integer n) {
		
		return n*2;
	}
}
