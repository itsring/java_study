package operating;

public class XOR_NOT {

	public static void main(String[] args) {
		// XOR , NOT
		int value1 = 0b01010011;
		int value2 = 0b01010110;
		//int = 4byte 
		int result1 = value1 ^ value2; //xor 같으면 0 다르면 1 
		int result2 = value1 | value2;
		System.out.println(toBinary(result1));
		
		//not 연산 ~  0 ->1 / 1 -> 0
		System.out.println(toBinary(~result1));
	}
	private static String toBinary(int n) {
		// 8자리 이진수로 보여주기 위한 메소드
		return String.format("%8s", Integer.toBinaryString(n)).replace(" ", "0");
	}
}
