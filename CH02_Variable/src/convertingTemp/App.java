package convertingTemp;

public class App {

	public static void main(String[] args) {
		// ¼·¾¾(¡É) ¡æ È­¾¾(¢µ)º¯È¯ (0µµC*9/5)+32=32µµF
		double celsius =25;
		double fahrenheit = (celsius*9/5)+32;
		System.out.println("¼·¾¾ "+celsius+"¡É´Â È­¾¾ "+fahrenheit+"¢µ ÀÌ´Ù");
	}

}
