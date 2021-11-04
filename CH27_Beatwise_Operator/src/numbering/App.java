package numbering;

public class App {

	public static void main(String[] args) {
		/*
		 * 10진수 Decimal 0~ 9
		 * 2진수 Binary  0 , 1
		 * 
		 * 16진수 Hexadecimal 0~F 2진수 4개 묶으면 16진수
		 */ 
		int value = 12333;
		System.out.println(Integer.toBinaryString(value));
		System.out.println(Integer.toHexString(value));
		System.out.println();
		
		int value255 = 0xFF; // 0x는 16진수를 의미, 0b는 이진수
		System.out.println(value255 ); //255
		System.out.println(Integer.toBinaryString(value255)); //1111=15 =F
		System.out.println(Integer.toHexString(value255));
		
	}

}
