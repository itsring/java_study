package treeSet;

import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String name;

	public Person(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
	@Override
	public int compareTo(Person other) {
		// Tree 셋이 정렬을 할 수 있도록 비교 방법을 코드로 작성한다.
		return name.compareTo(other.name);
	}
	
}


public class App {

	public static void main(String[] args) {
		// 정렬 기능 추가
		TreeSet<Person> people = new TreeSet<>();
		TreeSet<Integer> numbers = new TreeSet<>();
		people.add(new Person("펭수"));
		people.add(new Person("라이언"));
		people.add(new Person("가가멜"));
		people.add(new Person("스머프"));
		numbers.add(8);
		numbers.add(10);
		numbers.add(1);
		numbers.add(2);
		numbers.add(4);
		
		
		for(Person p : people) {
			System.out.println(p);
		}
		System.out.println();
		for(Integer n : numbers) {
			System.out.println(n);
		}
	}

}
