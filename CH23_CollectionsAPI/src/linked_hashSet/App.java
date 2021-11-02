package linked_hashSet;

import java.util.LinkedHashSet;

public class App {

	public static void main(String[] args) {
		// 링크드 해쉬셋 : 중복안되고 입력된 수서대로 출력
		LinkedHashSet<String> fruits = new LinkedHashSet<>();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("오렌지");
		fruits.add("사과");
		fruits.add("사과");
		
		//있으면 true 없으면 false
		System.out.println(fruits.contains("오렌지"));
		for(String f : fruits) {
			System.out.println(f);
		}
	}

}
