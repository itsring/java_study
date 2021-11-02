package hashMap;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		// hashMap은 순서가 있는것이 아니라 키 값으로 인덱스를 대체
		HashMap<Integer, String> people = new HashMap<>();
		// HashMap< key, value >
		//맵은 입력시 값이 2개(key,value)라서 add가 아니라 put을 사용 
		people.put(0, "펭수");
		people.put(1, "길동");
		people.put(3, "라이언");
		people.put(4, "프레드");
		people.put(4, "마이클"); // 4번 키에 값을 덮어 쓰기 (프레드 -> 마이클)
		people.put(10, "수지");
		
		System.out.println(people.get(4));
		
		String person = people.get(10);
		System.out.println(person);
		System.out.println();
		people.forEach((k,v)->{
			System.out.println(k+" : " + v);
		});
		//key값에해당하는 값을 가져오기
		System.out.println(people.get(4));
	}

}
