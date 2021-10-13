package application;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);// 스캐너를 사용할 수 있게 생성
		System.out.print("사과의 개수는?");
		int apple = scanner.nextInt();// 객체의 netxtInt() 메소드로 정수값을 입력
		System.out.print("바나나의 개수는?");
		int banana = scanner.nextInt();
		scanner.close();
		if (apple > banana) {
			System.out.println("사과가 바나나보다 많음");
		} else {
			System.out.println("바나나가 사과보다 많거나 같음");
		}
	}

}
