package arrayList;

import java.util.ArrayList;

public class Iterating {

	public static void main(String[] args) {
		// 반복문으로 자료를 꺼내는 방법

		ArrayList<Integer> list = new ArrayList<>();

		// 입력 .add(__);
		list.add(7);
		list.add(9);
		list.add(123);
		list.add(128900);
		
		//for each
		for(Integer n : list) {
			System.out.println(n);
		}
		System.out.println();
		
		for(int i =0; i< list.size();i++) {
			Integer n = list.get(i);
			System.out.println("인덱스 ["+i+"] : "+n);
		}
		System.out.println();
		
		//메소드 레퍼런스
		list.forEach(System.out::println);
		System.out.println();
		
		//list.forEach 메소드 람다식
		list.forEach (e -> {
			System.out.println(e);
		});
	}

}
