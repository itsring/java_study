package operating;

public class Shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 0b00010001;
		System.out.println(toBinary(value));
		int result1 = value<<3;
		System.out.println(toBinary(result1));
		int result2 = result1>>3;
		System.out.println(toBinary(result2));
		System.out.println(100<<2);
		System.out.println(100>>1);
	}
	private static String toBinary(int n) {
		// 8자리 이진수로 보여주기 위한 메소드
		return String.format("%8s", Integer.toBinaryString(n)).replace(" ", "0");
	}
}
