package array;

public class Bacteria {

	public static void main(String[] args) {
		int[] bacteriaCountLogs = new int[10];
		writeLog(bacteriaCountLogs);
		printLog(bacteriaCountLogs);

	}

	private static void printLog(int[] logs) {
		System.out.printf("[");
		for(int i=0; i<logs.length;i++) {
			System.out.printf("%d", logs[i]);
			if(i != logs.length-1) {
				System.out.printf(", ");
			}
		}
		System.out.printf("]");
		
	}

	private static void writeLog(int[] arr) {
		int result =2;
		for(int i=0; i<arr.length;i++) {
			arr[i] = (int)Math.pow(result, i);
		}
	}

}
