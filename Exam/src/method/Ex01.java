package method;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * Line 1
		 * >
		 * >
		 * >
		 * Line 2
		 */
		System.out.println("����1");
		threeLines();
		System.out.println("����2");
	}
	private static void threeLines() {
		oneLine();
		oneLine();
		oneLine();
	}//���� ���
	private static void oneLine() {
		System.out.println(">"); //���� ���
	}
	
}
