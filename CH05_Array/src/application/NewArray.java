package application;

public class NewArray {

	public static void main(String[] args) {
		// new Ű����� �迭����
		// int[] numbers={}; �ʱⰪ�� �ٷ� �ִ� ���
		int[] numbers = new int[3];
		for(int i=0; i<numbers.length; i++) {
			numbers[i]=i;
			System.out.println(numbers[i]);
		}

	}

}
