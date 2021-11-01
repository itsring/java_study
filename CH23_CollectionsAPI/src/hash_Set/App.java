 package hash_Set;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		// 셋(set) 형은 숫ㄴ서가 없고, 데이터 중복 안됨.
		HashSet<String> fruits = new HashSet<>();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("수박");
		fruits.add("귤");
		fruits.add("귤");
		fruits.add("딸기");
		fruits.add("딸기");
		fruits.add("사과");
		
		for(var fruit : fruits) {
			System.out.println(fruit);
			//결과 : 귤 수박 사과 바나나 딸기 5개만 나옴 , 중복된것 모두 없음 
			// 		순서도 입력순서가 아님.
			
		}
		//set리스트에 특정 아이템이 있는지 확인
		System.out.println(fruits.contains("귤"));
	}

}
