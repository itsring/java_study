package hashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OrderedMap {

	public static void main(String[] args) {
		// HashSet, LinkedHashSet, TreeSet  순서없음, 순서있음, 정열됨
		// HashMap, LinkedHashMap, TreeMap
		Map<Integer, String> months1 = new LinkedHashMap<Integer, String>();
		Map<Integer, String> months2 = new TreeMap<Integer, String>();
		months1.put(1, "1월");
		months1.put(3, "3월");
		months1.put(6, "6월");
		months2.put(3, "3월");
		months2.put(1, "1월");
		months2.put(6, "6월");
		//링크드 해시맵은 입력순으로 출력됨
		months1.forEach((k,v)->{
			System.out.println(k+" : "+v);
		});
		System.out.println();
		//트리맵은 정렬됨(키값으로 정렬)
		months2.forEach((k,v)->{
			System.out.println(k+" : "+v);
		});
		

	}

}
