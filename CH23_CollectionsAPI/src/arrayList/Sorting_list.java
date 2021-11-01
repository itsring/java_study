package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_list {

	public static void main(String[] args) {
		// 리스트를 정렬
		// 실수타입 리스트 생성
		ArrayList<Double> doubles = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		doubles.add(7.38);
		doubles.add(4.25);
		doubles.add(6.35);
		doubles.add(8.21);
		doubles.add(1.02);
		list.add(9);
		list.add(7);
		list.add(5);
		list.add(15);
		list.add(914);

		Collections.sort(doubles);// 정렬
		doubles.forEach(System.out::println);
		System.out.println();
		Collections.sort(list);// 정렬
		list.forEach(System.out::println);
		System.out.println();

		// 커스텀 객체 정렬
		ArrayList<Person> people = new ArrayList<>();
		people.add(new Person("펭수"));
		people.add(new Person("길동"));
		people.add(new Person("라이언"));
		people.add(new Person("폴리"));
		people.add(new Person("몰리"));

		people.forEach(System.out::println);
		System.out.println();
		Collections.sort(people);

		people.forEach(System.out::println);
	}

}
