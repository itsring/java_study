package hashSet_union_intersection;

import java.util.HashSet;

//		   해쉬셋_합집합_교집합
public class App {

	public static void main(String[] args) {
		HashSet<String> fruits1 = new HashSet<>();
		fruits1.add("사과");
		fruits1.add("배");
		fruits1.add("딸기");
		fruits1.add("수박");
		
		HashSet<String> fruits2 = new HashSet<>();
		fruits2.add("체리");
		fruits2.add("배");
		fruits2.add("사과");
		fruits2.add("귤");
		
		// 합집합 리스트 만들기
		// 생성자에 () 안에 리스트를 넣으면 넣은 리스트의 모든 값이 입력된 리스트가 생성
		HashSet<String> union = new HashSet<>(fruits1);
		union.forEach(System.out::println);
		System.out.println();
		//현재 리스트에 fruits2 리스트를 합침
		union.addAll(fruits2);
		union.forEach(System.out::println);
		
		//교집합
		HashSet<String> intersection = new HashSet<>(fruits1);
		//\첫번째 리스트와 두번 재 리스트가 같은 아이템만 남김
		intersection.retainAll(fruits2);
		System.out.println();
		intersection.forEach(System.out::println);
		
		
		//차집합 A-B : 두번 재 리스트로 빼고 남은 아이템
		HashSet<String> minus = new HashSet<>(fruits1);
		minus.removeAll(fruits2);
		System.out.println();
		minus.forEach(System.out::println);
		
	}

}
