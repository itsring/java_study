package operating;

public class And_Or {

	public static void main(String[] args) {
		// 비트연산 AND, OR
		int value1 = 0b01010011;
		int value2 = 0b01010110;
		System.out.println(value1);
		System.out.println(value2);
		int result1 = value1 & value2;
		System.out.println(result1);
		int result2 = value1 | value2;
		System.out.println(result2);
		
		System.out.println(toBinary(value1));
		System.out.println(toBinary(value2));
//		System.out.println(toBinary(result1));
		System.out.println(toBinary(result2));
		

	}

	private static String toBinary(int n) {
		// 8자리 이진수로 보여주기 위한 메소드
		return String.format("%8s", Integer.toBinaryString(n)).replace(" ", "0");
	}

}
