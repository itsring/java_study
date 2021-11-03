package lambda_interface;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAll {

	public static void main(String[] args) {
		// 리스트의 아이템 값응ㄹ 연산 결과로 대체
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(7);
		numbers.add(3);
		
		//리스트의 값들을 하나씩 연산결과로 대체한다.
		numbers.replaceAll(n -> n*n);
		
		numbers.forEach(t -> System.out.println(t));
		System.out.println();
		
		List<String> friends = new ArrayList<>();
		friends.add("펭수");
		friends.add("길동");
		friends.add("메리");
		friends.add("철수");
		
		//문자열 리스트의 밗들을 "안녕~" 을 붙여서 바꾼다.
		friends.replaceAll(s ->"안녕~"+s);
		friends.forEach(t -> System.out.println(t));
	}

}
