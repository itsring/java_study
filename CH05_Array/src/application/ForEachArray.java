package application;

public class ForEachArray {

	public static void main(String[] args) {
		// for each
		int[] numbers = {2,4,6};
		String[] fruits = { "바나나", "사과", "수박" };
		
		for(int x : numbers) {
			System.out.println(x);
		}
		
		for(String x : fruits) {
			System.out.println(x);
		}
	}

}
