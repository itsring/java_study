package application;

public class Boolean {

	public static void main(String[] args) {
		// 불린 타입은 참,거짓(true or false)
		boolean condition1 = false; // 대놓고 거짓을 넣기
		System.out.println("condition1 : " + condition1);

		boolean condition2 = 4 < 5; // 거짓인지 진실 인지 판별은 컴퓨터 몫 / 참
		System.out.println("condition2 : " + condition2);

		boolean condition3 = 2 > 8; // 거짓
		System.out.println("condition3 : " + condition3);
		// 9는 10과 다르다 / 거짓
		boolean condition4 = 9 == 10; 
		System.out.println("condition4 : " + condition4);
		// 불린 타입이 아니면 안들어감
		System.out.printf("condition4 : %b", condition4); 
	}

}
