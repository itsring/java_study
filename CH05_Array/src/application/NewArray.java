package application;

public class NewArray {

	public static void main(String[] args) {
		// new 키워드로 배열생성
		// int[] numbers={}; 초기값을 바로 넣는 방법
		int[] numbers = new int[3];
		for(int i=0; i<numbers.length; i++) {
			numbers[i]=i;
			System.out.println(numbers[i]);
		}

	}

}
