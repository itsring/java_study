package hashMap;

import java.util.HashMap;
import java.util.Map;

public class Iterating_Map {

	public static void main(String[] args) {
		// 반복문으로 맵의 아이템들을 전부 읽는 방법
		HashMap<String, String> months = new HashMap<>();
		months.put("JAN", "1월");
		months.put("FEB", "2월");
		months.put("MAR", "3월");
		months.put("APR", "4월");
		months.put("MAY", "5월");
		months.put("JUN", "6월");
		
		//1.람다식
		months.forEach((code, name)->{
			System.out.println(code+" : "+name);
		});
		System.out.println();
		//2.entrySet() : key와 value값을 가져옴
		for(Map.Entry<String, String> entry : months.entrySet()) {
			var code = entry.getKey();
			var name = entry.getValue();
			
			System.out.println(code + " : "+name);
			
		//keySet();
		}
		System.out.println();
		for(String k : months.keySet()) {
			String v = months.get(k);
			System.out.println(k + " : "+v);
		}
	}

}
