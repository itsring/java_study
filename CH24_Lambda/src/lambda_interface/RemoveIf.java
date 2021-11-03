package lambda_interface;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {

	public static void main(String[] args) {
		// 특정타입(제네릭)을 검사(test)해서 참/거짓 판별해 리턴
		List<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);
		numbers.add(6);
		numbers.add(5);
		numbers.add(7);
		numbers.add(9);
		numbers.add(8);
		numbers.add(10);
		
		
		/* 
		removeIf 메소드는 리스트의 아이템을 precate의 테스트 메소드로 검사해서
		참이면 제거
		*/
		numbers.removeIf(n-> n<6);//정수값이 6보다 작으면 참
		for(int n : numbers) {
			System.out.print(n+"\t");
		}

	}

}
