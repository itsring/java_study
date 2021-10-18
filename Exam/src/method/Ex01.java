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
		System.out.println("라인1");
		threeLines();
		System.out.println("라인2");
	}
	private static void threeLines() {
		oneLine();
		oneLine();
		oneLine();
	}//세줄 띄움
	private static void oneLine() {
		System.out.println(">"); //한줄 띄움
	}
	
}
