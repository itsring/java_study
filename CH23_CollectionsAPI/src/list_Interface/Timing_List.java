package list_Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timing_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		//클래스 카져올때 단축키 : Ctrl+Space(한개씩 가져올 때) 여러개 한번에 가져올때 Ctrl+Shift+o (영어 오)
		// linkedList를 timeOperation에 넣으면 결과값이 120이 나오고 
		// arrayList를 넣으면 LinkedList보다 5배 빠른 결과인 25정도 나온다.
		// 특정 위치에 추가 또는 제거 할 때 링크드 리스트가 10배는 빠르다.
		long duration = timeOperation(linkedList);
		System.out.println("측정 시간 : "+duration);
	}

	private static long timeOperation(List<Integer> list) {
		// 입력받은 리스트로 실행시간을 측정해서 리턴함 
		long start = System.currentTimeMillis(); // 현재 시간을 1ms 단위로 측정
		for(int i=0; i<100000; i++) {
			list.add(0,i);//백만번 입력
		}
		return System.currentTimeMillis()-start; // 작업이 끝난 후 측정 시간 - 이전시간
	}

}
