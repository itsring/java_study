package example_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		//key : Person, value : true or false
		Map<Person, Boolean> people1 = new HashMap<>();
		Map<Person, Boolean> people2 = new LinkedHashMap<>();
		Map<Person, Boolean> people3 = new TreeMap<>();
		
		//Map에서 키 값으로 중복을 결정하는데 Person클래스에서 equals 메소드를 이름으로 수정하면
		//이름이 같으면 중복이 된다.
		inputMap(people1);
		displayMap(people1);
		
		inputMap(people2);
		displayMap(people2);
		System.out.println();
		//TreeMap은 정렬을 해야하는데 key값인 Person객체가 비교 할 수 있는 메소드가 없다.
		// Comparable 인터페이스 추가
		inputMap(people3);
		displayMap(people3);

		
		
		
		

	}

	private static void displayMap(Map<Person, Boolean> map) {
		// 맵에있는 key와 value값 출력
		map.forEach((k,v)->{
			System.out.println(k+" : "+v);
		});
		System.out.println();
		
	}

	private static void inputMap(Map<Person, Boolean> map) {
		// Map에 key와 value를 입력
		map.put(new Person("펭수"), true);
		map.put(new Person("길동"), true);
		map.put(new Person("라이언"), false);
		map.put(new Person("둘리"), false);
		map.put(new Person("라이언"), false);
		map.put(new Person("둘리"), true);
	}

}
